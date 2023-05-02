package shoppingmall.demo.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MainItemDto { //메인페이지에서 상품을 보여줄때 사용

    private Long id;

    private String itemNm;

    private String itemDetail;

    private String imgUrl;

    private Integer price;

    // 기존에 쿼리dsl를 이용하여 상품 조회시 결과값을 받을 때 item객체로 반환값을 받았다면,
    //이번에는 @QueryProjection을 이용하여 dto 객체로 결과값을 받는다.
    @QueryProjection
    public MainItemDto(Long id, String itemNm, String itemDetail, String imgUrl,Integer price){
        this.id = id;
        this.itemNm = itemNm;
        this.itemDetail = itemDetail;
        this.imgUrl = imgUrl;
        this.price = price;
    }

}