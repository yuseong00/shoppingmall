package shoppingmall.demo.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import shoppingmall.demo.dto.ItemSearchDto;
import shoppingmall.demo.dto.MainItemDto;
import shoppingmall.demo.entity.Item;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}