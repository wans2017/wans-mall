package com.wans.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.mall.pms.entity.Brand;

import java.util.Map;

/**
 * 品牌
 *
 * @author wans
 * @date 2020-10-22 16:08:26
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);
}

