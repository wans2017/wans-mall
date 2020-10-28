package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.SeckillSkuNoticeDao;
import com.wans.mall.sms.entity.SeckillSkuNotice;
import com.wans.mall.sms.service.SeckillSkuNoticeService;

/**
 * 秒杀商品通知订阅
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl extends ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNotice> implements SeckillSkuNoticeService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SeckillSkuNotice> page = this.page(
                new Query<SeckillSkuNotice>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}