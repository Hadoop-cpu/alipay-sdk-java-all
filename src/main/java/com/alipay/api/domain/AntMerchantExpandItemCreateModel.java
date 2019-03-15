package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品创建接口
 *
 * @author auto create
 * @since 1.0, 2019-01-18 10:43:36
 */
public class AntMerchantExpandItemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4475153997793115642L;

	/**
	 * 商品扩展信息：可以解析成 Map<String, String> 的 json string
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 前台类目id：target_type + target_id 和 front_category_id 二选一
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	/**
	 * 商品标签列表
	 */
	@ApiListField("label_list")
	@ApiField("item_label_create_info")
	private List<ItemLabelCreateInfo> labelList;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 场景：GAS_CHARGE（加油）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 商品sku列表，至少有一个
	 */
	@ApiListField("sku_list")
	@ApiField("item_sku_create_info")
	private List<ItemSkuCreateInfo> skuList;

	/**
	 * 商户归属主体id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 商品归属主体类型：target_type + target_id 和 front_category_id 二选一

商品归属主体类型:
5: 店铺
4: 主站MID
3: 参与者
2: 角色
1: 联系人
	 */
	@ApiField("target_type")
	private String targetType;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFrontCategoryId() {
		return this.frontCategoryId;
	}
	public void setFrontCategoryId(String frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}

	public List<ItemLabelCreateInfo> getLabelList() {
		return this.labelList;
	}
	public void setLabelList(List<ItemLabelCreateInfo> labelList) {
		this.labelList = labelList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public List<ItemSkuCreateInfo> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<ItemSkuCreateInfo> skuList) {
		this.skuList = skuList;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}