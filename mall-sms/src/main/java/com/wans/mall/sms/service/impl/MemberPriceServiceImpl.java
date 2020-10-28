package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.MemberPriceDao;
import com.wans.mall.sms.entity.MemberPrice;
import com.wans.mall.sms.service.MemberPriceService;

/**
 * 商品会员价格
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("memberPriceService")
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceDao, MemberPrice> implements MemberPriceService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberPrice> page = this.page(
                new Query<MemberPrice>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}