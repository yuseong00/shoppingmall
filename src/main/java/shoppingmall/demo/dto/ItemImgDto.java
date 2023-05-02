package shoppingmall.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import shoppingmall.demo.entity.ItemImg;

@Getter @Setter
public class ItemImgDto { // ItemImgDto 클래스는 상품 이미지 정보를 담는 클래스입니다.

    private Long id;

    private String imgName;

    private String oriImgName;

    private String imgUrl;

    private String repImgYn;

    private static ModelMapper modelMapper = new ModelMapper();

    public static ItemImgDto of(ItemImg itemImg) {
        return modelMapper.map(itemImg,ItemImgDto.class);
    }

}