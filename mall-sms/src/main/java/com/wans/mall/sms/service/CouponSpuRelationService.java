package com.wans.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.sms.entity.CouponSpuRelation;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelation> {

    PageVo queryPage(QueryCondition params);
}

