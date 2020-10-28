package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.SkuBoundsDao;
import com.wans.mall.sms.entity.SkuBounds;
import com.wans.mall.sms.service.SkuBoundsService;

/**
 * 商品sku积分设置
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("skuBoundsService")
public class SkuBoundsServiceImpl extends ServiceImpl<SkuBoundsDao, SkuBounds> implements SkuBoundsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SkuBounds> page = this.page(
                new Query<SkuBounds>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}