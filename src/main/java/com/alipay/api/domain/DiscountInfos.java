package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠明细信息
 *
 * @author auto create
 * @since 1.0, 2018-08-30 10:41:10
 */
public class DiscountInfos extends AlipayObject {

	private static final long serialVersionUID = 1181251824693494738L;

	/**
	 * 优惠金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 本次支付商家优惠的金额
	 */
	@ApiField("mdiscount_amount")
	private String mdiscountAmount;

	/**
	 * 优惠名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 本次支付平台补贴的金额
	 */
	@ApiField("platform_discount_amount")
	private String platformDiscountAmount;

	/**
	 * 优惠类型
	 */
	@ApiField("type")
	private String type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public String getMdiscountAmount() {
		return this.mdiscountAmount;
	}
	public void setMdiscountAmount(String mdiscountAmount) {
		this.mdiscountAmount = mdiscountAmount;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPlatformDiscountAmount() {
		return this.platformDiscountAmount;
	}
	public void setPlatformDiscountAmount(String platformDiscountAmount) {
		this.platformDiscountAmount = platformDiscountAmount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}