package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.SpuLadderDao;
import com.wans.mall.sms.entity.SpuLadder;
import com.wans.mall.sms.service.SpuLadderService;

/**
 * 商品阶梯价格
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("spuLadderService")
public class SpuLadderServiceImpl extends ServiceImpl<SpuLadderDao, SpuLadder> implements SpuLadderService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuLadder> page = this.page(
                new Query<SpuLadder>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}