package shoppingmall.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingmall.demo.entity.Item;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {


    List<Item> findByItemNm(String itemNm);

    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

    List<Item> findByPriceLessThan(Integer price);

    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);


}
