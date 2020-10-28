package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.SpuBoundsDao;
import com.wans.mall.sms.entity.SpuBounds;
import com.wans.mall.sms.service.SpuBoundsService;

/**
 * 商品spu积分设置
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBounds> implements SpuBoundsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuBounds> page = this.page(
                new Query<SpuBounds>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}