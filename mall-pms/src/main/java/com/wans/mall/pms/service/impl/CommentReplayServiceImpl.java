package com.wans.mall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.pms.dao.CommentReplayDao;
import com.wans.mall.pms.entity.CommentReplay;
import com.wans.mall.pms.service.CommentReplayService;

/**
 * 商品评价回复关系
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplay> implements CommentReplayService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CommentReplay> page = this.page(
                new Query<CommentReplay>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}