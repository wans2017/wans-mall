package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.SpuFullReductionDao;
import com.wans.mall.sms.entity.SpuFullReduction;
import com.wans.mall.sms.service.SpuFullReductionService;

/**
 * 商品满减信息
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("spuFullReductionService")
public class SpuFullReductionServiceImpl extends ServiceImpl<SpuFullReductionDao, SpuFullReduction> implements SpuFullReductionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuFullReduction> page = this.page(
                new Query<SpuFullReduction>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}