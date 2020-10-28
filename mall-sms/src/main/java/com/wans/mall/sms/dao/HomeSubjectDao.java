package com.wans.mall.sms.dao;

import com.wans.mall.sms.entity.HomeSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubject> {
	
}
