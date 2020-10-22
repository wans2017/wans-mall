package com.wans.mall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.pms.dao.SpuInfoDescDao;
import com.wans.mall.pms.entity.SpuInfoDesc;
import com.wans.mall.pms.service.SpuInfoDescService;

/**
 * spu信息介绍
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescDao, SpuInfoDesc> implements SpuInfoDescService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuInfoDesc> page = this.page(
                new Query<SpuInfoDesc>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}