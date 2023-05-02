package shoppingmall.demo.repository;

import com.querydsl.core.BooleanBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import shoppingmall.demo.entity.Item;
import shoppingmall.demo.entity.constant.ItemSellStatus;
import shoppingmall.demo.entity.QItem;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long>,
        QuerydslPredicateExecutor<Item>, ItemRepositoryCustom {



    List<Item> findByItemNm(String itemNm);

    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

    List<Item> findByPriceLessThan(Integer price);

    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

    @Query("select i from Item i where i.itemDetail like " +
            "%:itemDetail% order by i.price desc")
    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);

    default List<Item> searchItems(String itemDetail, int price, ItemSellStatus itemSellStatus) {
        BooleanBuilder builder = new BooleanBuilder();
        QItem item = QItem.item;

        if (StringUtils.isNotEmpty(itemDetail)) { //StringUtils.isNotEmpty() : 문자열이 비어있지 않은지 확인
            builder.and(item.itemDetail.containsIgnoreCase(itemDetail));
        }

        if (price > 0) {   //price가 0보다 큰지 확인
            builder.and(item.price.gt(price));
        }

        if (itemSellStatus != null) {   //itemSellStatus가 null이 아닌지 확인
            builder.and(item.itemSellStatus.eq(itemSellStatus));
        }

        return (List<Item>) findAll(builder);
    }


}
