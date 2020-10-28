package com.wans.mall.sms.controller;
import java.util.Arrays;
import java.util.Map;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.wans.mall.sms.entity.SeckillSkuRelation;
import com.wans.mall.sms.service.SeckillSkuRelationService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.common.utils.Resp;

/**
 * 秒杀活动商品关联
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Api(tags = "秒杀活动商品关联 管理")
@RestController
@RequestMapping("sms/seckillskurelation")
public class SeckillSkuRelationController {
    @Autowired
    private SeckillSkuRelationService seckillSkuRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:seckillskurelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = seckillSkuRelationService.queryPage(queryCondition);
        return Resp.ok(page);
    }

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:seckillskurelation:info')")
    public Resp<SeckillSkuRelation> info(@PathVariable("id") Long id){
        SeckillSkuRelation seckillSkuRelation = seckillSkuRelationService.getById(id);
        return Resp.ok(seckillSkuRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:seckillskurelation:save')")
    public Resp<Object> save(@RequestBody SeckillSkuRelation seckillSkuRelation){
        seckillSkuRelationService.save(seckillSkuRelation);
        return Resp.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:seckillskurelation:update')")
    public Resp<Object> update(@RequestBody SeckillSkuRelation seckillSkuRelation){
        seckillSkuRelationService.updateById(seckillSkuRelation);
        return Resp.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:seckillskurelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        seckillSkuRelationService.removeByIds(Arrays.asList(ids));
        return Resp.ok();
    }

}
