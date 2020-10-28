package com.wans.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.sms.entity.HomeSubjectSpu;

import java.util.Map;

/**
 * 专题商品
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpu> {

    PageVo queryPage(QueryCondition params);
}

