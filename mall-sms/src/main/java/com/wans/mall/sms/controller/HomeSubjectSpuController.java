package com.wans.mall.sms.controller;
import java.util.Arrays;
import java.util.Map;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.wans.mall.sms.entity.HomeSubjectSpu;
import com.wans.mall.sms.service.HomeSubjectSpuService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.common.utils.Resp;

/**
 * 专题商品
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Api(tags = "专题商品 管理")
@RestController
@RequestMapping("sms/homesubjectspu")
public class HomeSubjectSpuController {
    @Autowired
    private HomeSubjectSpuService homeSubjectSpuService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:homesubjectspu:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = homeSubjectSpuService.queryPage(queryCondition);
        return Resp.ok(page);
    }

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:homesubjectspu:info')")
    public Resp<HomeSubjectSpu> info(@PathVariable("id") Long id){
        HomeSubjectSpu homeSubjectSpu = homeSubjectSpuService.getById(id);
        return Resp.ok(homeSubjectSpu);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:homesubjectspu:save')")
    public Resp<Object> save(@RequestBody HomeSubjectSpu homeSubjectSpu){
        homeSubjectSpuService.save(homeSubjectSpu);
        return Resp.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:homesubjectspu:update')")
    public Resp<Object> update(@RequestBody HomeSubjectSpu homeSubjectSpu){
        homeSubjectSpuService.updateById(homeSubjectSpu);
        return Resp.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:homesubjectspu:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        homeSubjectSpuService.removeByIds(Arrays.asList(ids));
        return Resp.ok();
    }

}
