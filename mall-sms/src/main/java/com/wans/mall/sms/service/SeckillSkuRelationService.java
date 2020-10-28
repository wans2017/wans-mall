package com.wans.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.sms.entity.SeckillSkuRelation;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelation> {

    PageVo queryPage(QueryCondition params);
}

