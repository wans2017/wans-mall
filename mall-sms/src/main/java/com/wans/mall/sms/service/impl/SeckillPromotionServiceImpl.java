package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.SeckillPromotionDao;
import com.wans.mall.sms.entity.SeckillPromotion;
import com.wans.mall.sms.service.SeckillPromotionService;

/**
 * 秒杀活动
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("seckillPromotionService")
public class SeckillPromotionServiceImpl extends ServiceImpl<SeckillPromotionDao, SeckillPromotion> implements SeckillPromotionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SeckillPromotion> page = this.page(
                new Query<SeckillPromotion>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}