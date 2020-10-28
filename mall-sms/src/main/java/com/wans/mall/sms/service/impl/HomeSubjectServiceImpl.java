package com.wans.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.Query;
import com.wans.common.utils.QueryCondition;

import com.wans.mall.sms.dao.HomeSubjectDao;
import com.wans.mall.sms.entity.HomeSubject;
import com.wans.mall.sms.service.HomeSubjectService;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Service("homeSubjectService")
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectDao, HomeSubject> implements HomeSubjectService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeSubject> page = this.page(
                new Query<HomeSubject>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}