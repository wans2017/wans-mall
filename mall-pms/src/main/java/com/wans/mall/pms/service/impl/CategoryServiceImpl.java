package com.wans.mall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.pms.dao.CategoryDao;
import com.wans.mall.pms.entity.Category;
import com.wans.mall.pms.service.CategoryService;

/**
 * 商品三级分类
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, Category> implements CategoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<Category> page = this.page(
                new Query<Category>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}