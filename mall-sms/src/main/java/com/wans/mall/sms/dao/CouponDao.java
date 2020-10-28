package com.wans.mall.sms.dao;

import com.wans.mall.sms.entity.Coupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Mapper
public interface CouponDao extends BaseMapper<Coupon> {
	
}
