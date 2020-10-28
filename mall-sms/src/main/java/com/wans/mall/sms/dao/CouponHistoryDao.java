package com.wans.mall.sms.dao;

import com.wans.mall.sms.entity.CouponHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistory> {
	
}
