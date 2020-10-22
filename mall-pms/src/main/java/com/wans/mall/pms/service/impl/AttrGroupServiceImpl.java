package com.wans.mall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.pms.dao.AttrGroupDao;
import com.wans.mall.pms.entity.AttrGroup;
import com.wans.mall.pms.service.AttrGroupService;

/**
 * 属性分组
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroup> implements AttrGroupService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrGroup> page = this.page(
                new Query<AttrGroup>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}