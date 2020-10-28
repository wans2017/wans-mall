package com.wans.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.sms.entity.SeckillSkuNotice;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNotice> {

    PageVo queryPage(QueryCondition params);
}

