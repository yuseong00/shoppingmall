package shoppingmall.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CartOrderDto { // CartOrderDto 클래스는 장바구니에 담긴 상품 정보를 담는 클래스입니다.

    private Long cartItemId;

    private List<CartOrderDto> cartOrderDtoList;

}