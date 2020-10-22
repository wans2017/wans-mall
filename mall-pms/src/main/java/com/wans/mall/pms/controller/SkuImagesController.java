package com.wans.mall.pms.controller;
import java.util.Arrays;
import java.util.Map;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.wans.mall.pms.entity.SkuImages;
import com.wans.mall.pms.service.SkuImagesService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.common.utils.Resp;

/**
 * sku图片
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
@RestController
@RequestMapping("pms/skuimages")
public class SkuImagesController {
    @Autowired
    private SkuImagesService skuImagesService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:skuimages:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = skuImagesService.queryPage(queryCondition);
        return Resp.ok(page);
    }

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:skuimages:info')")
    public Resp<SkuImages> info(@PathVariable("id") Long id){
        SkuImages skuImages = skuImagesService.getById(id);
        return Resp.ok(skuImages);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:skuimages:save')")
    public Resp<Object> save(@RequestBody SkuImages skuImages){
        skuImagesService.save(skuImages);
        return Resp.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:skuimages:update')")
    public Resp<Object> update(@RequestBody SkuImages skuImages){
        skuImagesService.updateById(skuImages);
        return Resp.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:skuimages:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        skuImagesService.removeByIds(Arrays.asList(ids));
        return Resp.ok();
    }

}
