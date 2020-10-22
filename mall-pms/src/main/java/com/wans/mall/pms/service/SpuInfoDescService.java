package com.wans.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.pms.entity.SpuInfoDesc;

import java.util.Map;

/**
 * spu信息介绍
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
public interface SpuInfoDescService extends IService<SpuInfoDesc> {

    PageVo queryPage(QueryCondition params);
}

