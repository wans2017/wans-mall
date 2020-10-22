package com.wans.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.pms.entity.Attr;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wans
 * @date 2020-10-22 16:08:26
 */
public interface AttrService extends IService<Attr> {

    PageVo queryPage(QueryCondition params);
}

