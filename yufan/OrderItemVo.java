package nju.yufan.webstore.order.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemVo {
	private int goodsId;
	private String sku;
	private String imgURL;
	private String goodsName;
}