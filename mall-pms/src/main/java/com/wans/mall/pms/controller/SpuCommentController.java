package com.wans.mall.pms.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.wans.mall.pms.entity.SpuComment;
import com.wans.mall.pms.service.SpuCommentService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.common.utils.Resp;


/**
 * 商品评价
 *
 * @author wans
 * @email 
 * @date 2020-10-22 16:08:26
 */
@RestController
@RequestMapping("pms/spucomment")
public class SpuCommentController {
    @Autowired
    private SpuCommentService spuCommentService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:spucomment:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = spuCommentService.queryPage(queryCondition);
        return Resp.ok(page);
    }

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:spucomment:info')")
    public Resp<SpuComment> info(@PathVariable("id") Long id){
        SpuComment spuComment = spuCommentService.getById(id);
        return Resp.ok(spuComment);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:spucomment:save')")
    public Resp<Object> save(@RequestBody SpuComment spuComment){
        spuCommentService.save(spuComment);
        return Resp.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:spucomment:update')")
    public Resp<Object> update(@RequestBody SpuComment spuComment){
        spuCommentService.updateById(spuComment);
        return Resp.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:spucomment:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        spuCommentService.removeByIds(Arrays.asList(ids));
        return Resp.ok();
    }

}
