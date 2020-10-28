package com.wans.mall.sms.controller;
import java.util.Arrays;
import java.util.Map;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.wans.mall.sms.entity.SpuBounds;
import com.wans.mall.sms.service.SpuBoundsService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.common.utils.Resp;

/**
 * 商品spu积分设置
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Api(tags = "商品spu积分设置 管理")
@RestController
@RequestMapping("sms/spubounds")
public class SpuBoundsController {
    @Autowired
    private SpuBoundsService spuBoundsService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:spubounds:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = spuBoundsService.queryPage(queryCondition);
        return Resp.ok(page);
    }

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:spubounds:info')")
    public Resp<SpuBounds> info(@PathVariable("id") Long id){
        SpuBounds spuBounds = spuBoundsService.getById(id);
        return Resp.ok(spuBounds);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:spubounds:save')")
    public Resp<Object> save(@RequestBody SpuBounds spuBounds){
        spuBoundsService.save(spuBounds);
        return Resp.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:spubounds:update')")
    public Resp<Object> update(@RequestBody SpuBounds spuBounds){
        spuBoundsService.updateById(spuBounds);
        return Resp.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:spubounds:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        spuBoundsService.removeByIds(Arrays.asList(ids));
        return Resp.ok();
    }

}
