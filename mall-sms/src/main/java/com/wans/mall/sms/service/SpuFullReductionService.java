package com.wans.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.sms.entity.SpuFullReduction;

import java.util.Map;

/**
 * 商品满减信息
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
public interface SpuFullReductionService extends IService<SpuFullReduction> {

    PageVo queryPage(QueryCondition params);
}

