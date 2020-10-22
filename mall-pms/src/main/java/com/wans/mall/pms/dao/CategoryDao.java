package com.wans.mall.pms.dao;

import com.wans.mall.pms.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
	
}
