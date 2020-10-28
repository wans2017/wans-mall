package com.wans.mall.sms.controller;
import java.util.Arrays;
import java.util.Map;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.wans.mall.sms.entity.HomeAdv;
import com.wans.mall.sms.service.HomeAdvService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.common.utils.Resp;

/**
 * 首页轮播广告
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Api(tags = "首页轮播广告 管理")
@RestController
@RequestMapping("sms/homeadv")
public class HomeAdvController {
    @Autowired
    private HomeAdvService homeAdvService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:homeadv:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = homeAdvService.queryPage(queryCondition);
        return Resp.ok(page);
    }

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:homeadv:info')")
    public Resp<HomeAdv> info(@PathVariable("id") Long id){
        HomeAdv homeAdv = homeAdvService.getById(id);
        return Resp.ok(homeAdv);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:homeadv:save')")
    public Resp<Object> save(@RequestBody HomeAdv homeAdv){
        homeAdvService.save(homeAdv);
        return Resp.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:homeadv:update')")
    public Resp<Object> update(@RequestBody HomeAdv homeAdv){
        homeAdvService.updateById(homeAdv);
        return Resp.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:homeadv:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        homeAdvService.removeByIds(Arrays.asList(ids));
        return Resp.ok();
    }

}
