package com.wans.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.sms.entity.HomeAdv;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
public interface HomeAdvService extends IService<HomeAdv> {

    PageVo queryPage(QueryCondition params);
}

