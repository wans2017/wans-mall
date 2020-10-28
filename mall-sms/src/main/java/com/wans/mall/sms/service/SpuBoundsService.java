package com.wans.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.sms.entity.SpuBounds;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
public interface SpuBoundsService extends IService<SpuBounds> {

    PageVo queryPage(QueryCondition params);
}

