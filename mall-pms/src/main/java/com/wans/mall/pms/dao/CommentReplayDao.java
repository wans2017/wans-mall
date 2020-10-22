package com.wans.mall.pms.dao;

import com.wans.mall.pms.entity.CommentReplay;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplay> {
	
}
