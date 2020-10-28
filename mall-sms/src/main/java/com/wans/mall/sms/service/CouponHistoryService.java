package com.wans.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.sms.entity.CouponHistory;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
public interface CouponHistoryService extends IService<CouponHistory> {

    PageVo queryPage(QueryCondition params);
}

