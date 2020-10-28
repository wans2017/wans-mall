package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.CouponHistoryDao;
import com.wans.mall.sms.entity.CouponHistory;
import com.wans.mall.sms.service.CouponHistoryService;

/**
 * 优惠券领取历史记录
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryDao, CouponHistory> implements CouponHistoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponHistory> page = this.page(
                new Query<CouponHistory>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}