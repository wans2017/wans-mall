package com.wans.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.pms.entity.SkuImages;

import java.util.Map;

/**
 * sku图片
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
public interface SkuImagesService extends IService<SkuImages> {

    PageVo queryPage(QueryCondition params);
}

