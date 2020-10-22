package com.wans.mall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu信息介绍
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDesc implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	@ApiModelProperty(name = "spuId",value = "商品id")
    private Long spuId;
	/**
	 * 商品介绍
	 */
	@ApiModelProperty(name = "decript",value = "商品介绍")
    private String decript;

}
