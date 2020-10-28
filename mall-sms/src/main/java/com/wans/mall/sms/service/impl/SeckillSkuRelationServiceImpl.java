package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.SeckillSkuRelationDao;
import com.wans.mall.sms.entity.SeckillSkuRelation;
import com.wans.mall.sms.service.SeckillSkuRelationService;

/**
 * 秒杀活动商品关联
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("seckillSkuRelationService")
public class SeckillSkuRelationServiceImpl extends ServiceImpl<SeckillSkuRelationDao, SeckillSkuRelation> implements SeckillSkuRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SeckillSkuRelation> page = this.page(
                new Query<SeckillSkuRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}