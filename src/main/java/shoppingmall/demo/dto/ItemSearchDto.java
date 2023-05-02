package shoppingmall.demo.dto;

import lombok.Getter;
import lombok.Setter;
import shoppingmall.demo.entity.constant.ItemSellStatus;

@Getter @Setter
public class ItemSearchDto {

    private String searchDateType;

    private ItemSellStatus searchSellStatus;

    private String searchBy;

    private String searchQuery = "";

}