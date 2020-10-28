package com.wans.mall.sms.controller;
import java.util.Arrays;
import java.util.Map;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.wans.mall.sms.entity.HomeSubject;
import com.wans.mall.sms.service.HomeSubjectService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.common.utils.Resp;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Api(tags = "首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 管理")
@RestController
@RequestMapping("sms/homesubject")
public class HomeSubjectController {
    @Autowired
    private HomeSubjectService homeSubjectService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:homesubject:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = homeSubjectService.queryPage(queryCondition);
        return Resp.ok(page);
    }

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:homesubject:info')")
    public Resp<HomeSubject> info(@PathVariable("id") Long id){
        HomeSubject homeSubject = homeSubjectService.getById(id);
        return Resp.ok(homeSubject);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:homesubject:save')")
    public Resp<Object> save(@RequestBody HomeSubject homeSubject){
        homeSubjectService.save(homeSubject);
        return Resp.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:homesubject:update')")
    public Resp<Object> update(@RequestBody HomeSubject homeSubject){
        homeSubjectService.updateById(homeSubject);
        return Resp.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:homesubject:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        homeSubjectService.removeByIds(Arrays.asList(ids));
        return Resp.ok();
    }

}
