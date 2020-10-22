package com.wans.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.pms.entity.CommentReplay;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author wans
 * @date 2020-10-22 16:08:26
 */
public interface CommentReplayService extends IService<CommentReplay> {

    PageVo queryPage(QueryCondition params);
}

