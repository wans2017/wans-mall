package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.SkuFullReductionDao;
import com.wans.mall.sms.entity.SkuFullReduction;
import com.wans.mall.sms.service.SkuFullReductionService;

/**
 * 商品满减信息
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("skuFullReductionService")
public class SkuFullReductionServiceImpl extends ServiceImpl<SkuFullReductionDao, SkuFullReduction> implements SkuFullReductionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SkuFullReduction> page = this.page(
                new Query<SkuFullReduction>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}