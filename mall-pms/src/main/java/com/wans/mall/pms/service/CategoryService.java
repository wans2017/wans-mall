package com.wans.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.pms.entity.Category;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author wans
 * @date 2020-10-22 16:08:26
 */
public interface CategoryService extends IService<Category> {

    PageVo queryPage(QueryCondition params);
}

