package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.CategoryBoundsDao;
import com.wans.mall.sms.entity.CategoryBounds;
import com.wans.mall.sms.service.CategoryBoundsService;

/**
 * 商品分类积分设置
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("categoryBoundsService")
public class CategoryBoundsServiceImpl extends ServiceImpl<CategoryBoundsDao, CategoryBounds> implements CategoryBoundsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CategoryBounds> page = this.page(
                new Query<CategoryBounds>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}