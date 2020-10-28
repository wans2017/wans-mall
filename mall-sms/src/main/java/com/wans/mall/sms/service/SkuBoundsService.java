package com.wans.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.sms.entity.SkuBounds;

import java.util.Map;

/**
 * 商品sku积分设置
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
public interface SkuBoundsService extends IService<SkuBounds> {

    PageVo queryPage(QueryCondition params);
}

