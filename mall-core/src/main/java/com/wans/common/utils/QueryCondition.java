package com.wans.common.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * 分页参数条件
 * Created by wans on 2020/10/16.
 */
@ApiModel
@Data
public class QueryCondition {


    @ApiModelProperty(name = "page",value = "页码",required = false)
    private Long page;

    @ApiModelProperty(name = "limit",value = "每页大小",required = false)
    private Long limit;

    @ApiModelProperty(name = "sidx",value = "排序的字段",required = false)
    private String sidx;

    @ApiModelProperty(name = "order",value = "排序的顺序",required = false)
    private String order;

    @ApiModelProperty(name = "asc",value = "系统默认排序",required = false)
    private String asc = "asc";
}