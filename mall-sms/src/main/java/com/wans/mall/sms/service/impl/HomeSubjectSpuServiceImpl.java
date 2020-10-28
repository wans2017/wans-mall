package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.HomeSubjectSpuDao;
import com.wans.mall.sms.entity.HomeSubjectSpu;
import com.wans.mall.sms.service.HomeSubjectSpuService;

/**
 * 专题商品
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("homeSubjectSpuService")
public class HomeSubjectSpuServiceImpl extends ServiceImpl<HomeSubjectSpuDao, HomeSubjectSpu> implements HomeSubjectSpuService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeSubjectSpu> page = this.page(
                new Query<HomeSubjectSpu>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}