package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.CouponSpuRelationDao;
import com.wans.mall.sms.entity.CouponSpuRelation;
import com.wans.mall.sms.service.CouponSpuRelationService;

/**
 * 优惠券与产品关联
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationDao, CouponSpuRelation> implements CouponSpuRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponSpuRelation> page = this.page(
                new Query<CouponSpuRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}