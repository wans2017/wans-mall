package com.wans.mall.pms.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.wans.mall.pms.entity.SkuSaleAttrValue;
import com.wans.mall.pms.service.SkuSaleAttrValueService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.common.utils.Resp;


/**
 * sku销售属性&值
 *
 * @author wans
 * @email 
 * @date 2020-10-22 16:08:26
 */
@RestController
@RequestMapping("pms/skusaleattrvalue")
public class SkuSaleAttrValueController {
    @Autowired
    private SkuSaleAttrValueService skuSaleAttrValueService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:skusaleattrvalue:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = skuSaleAttrValueService.queryPage(queryCondition);
        return Resp.ok(page);
    }

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:skusaleattrvalue:info')")
    public Resp<SkuSaleAttrValue> info(@PathVariable("id") Long id){
        SkuSaleAttrValue skuSaleAttrValue = skuSaleAttrValueService.getById(id);
        return Resp.ok(skuSaleAttrValue);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:skusaleattrvalue:save')")
    public Resp<Object> save(@RequestBody SkuSaleAttrValue skuSaleAttrValue){
        skuSaleAttrValueService.save(skuSaleAttrValue);
        return Resp.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:skusaleattrvalue:update')")
    public Resp<Object> update(@RequestBody SkuSaleAttrValue skuSaleAttrValue){
        skuSaleAttrValueService.updateById(skuSaleAttrValue);
        return Resp.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:skusaleattrvalue:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        skuSaleAttrValueService.removeByIds(Arrays.asList(ids));
        return Resp.ok();
    }

}
