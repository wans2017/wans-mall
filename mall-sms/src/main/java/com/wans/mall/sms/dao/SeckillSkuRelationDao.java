package com.wans.mall.sms.dao;

import com.wans.mall.sms.entity.SeckillSkuRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelation> {
	
}
