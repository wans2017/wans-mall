package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.SkuLadderDao;
import com.wans.mall.sms.entity.SkuLadder;
import com.wans.mall.sms.service.SkuLadderService;

/**
 * 商品阶梯价格
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("skuLadderService")
public class SkuLadderServiceImpl extends ServiceImpl<SkuLadderDao, SkuLadder> implements SkuLadderService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SkuLadder> page = this.page(
                new Query<SkuLadder>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}