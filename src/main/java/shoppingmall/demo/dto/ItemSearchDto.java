package shoppingmall.demo.dto;

import lombok.Getter;
import lombok.Setter;
import shoppingmall.demo.entity.constant.ItemSellStatus;

@Getter @Setter
public class ItemSearchDto { // ItemSearchDto 클래스는 상품 검색 조건을 담는 클래스입니다.

    private String searchDateType;

    private ItemSellStatus searchSellStatus;

    private String searchBy;

    private String searchQuery = "";

}