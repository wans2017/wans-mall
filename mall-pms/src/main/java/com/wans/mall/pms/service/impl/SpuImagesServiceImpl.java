package com.wans.mall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.pms.dao.SpuImagesDao;
import com.wans.mall.pms.entity.SpuImages;
import com.wans.mall.pms.service.SpuImagesService;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImages> implements SpuImagesService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuImages> page = this.page(
                new Query<SpuImages>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}