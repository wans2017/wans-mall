package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.CouponSpuCategoryRelationDao;
import com.wans.mall.sms.entity.CouponSpuCategoryRelation;
import com.wans.mall.sms.service.CouponSpuCategoryRelationService;

/**
 * 优惠券分类关联
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("couponSpuCategoryRelationService")
public class CouponSpuCategoryRelationServiceImpl extends ServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelation> implements CouponSpuCategoryRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponSpuCategoryRelation> page = this.page(
                new Query<CouponSpuCategoryRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}