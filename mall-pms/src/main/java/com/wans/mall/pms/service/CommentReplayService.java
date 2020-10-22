package com.wans.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.pms.entity.CommentReplay;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
public interface CommentReplayService extends IService<CommentReplay> {

    PageVo queryPage(QueryCondition params);
}

