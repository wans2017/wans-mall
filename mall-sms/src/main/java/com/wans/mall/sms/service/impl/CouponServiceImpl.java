package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.CouponDao;
import com.wans.mall.sms.entity.Coupon;
import com.wans.mall.sms.service.CouponService;

/**
 * 优惠券信息
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponDao, Coupon> implements CouponService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<Coupon> page = this.page(
                new Query<Coupon>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}