package com.wans.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.pms.entity.SkuInfo;

import java.util.Map;

/**
 * sku信息
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
public interface SkuInfoService extends IService<SkuInfo> {

    PageVo queryPage(QueryCondition params);
}

