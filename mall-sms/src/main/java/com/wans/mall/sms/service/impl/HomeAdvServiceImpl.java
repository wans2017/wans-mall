package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.HomeAdvDao;
import com.wans.mall.sms.entity.HomeAdv;
import com.wans.mall.sms.service.HomeAdvService;

/**
 * 首页轮播广告
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvDao, HomeAdv> implements HomeAdvService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeAdv> page = this.page(
                new Query<HomeAdv>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}