package com.wans.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.pms.entity.AttrGroup;

import java.util.Map;

/**
 * 属性分组
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
public interface AttrGroupService extends IService<AttrGroup> {

    PageVo queryPage(QueryCondition params);
}

