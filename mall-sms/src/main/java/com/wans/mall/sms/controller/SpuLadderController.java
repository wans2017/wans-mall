package com.wans.mall.sms.controller;
import java.util.Arrays;
import java.util.Map;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.wans.mall.sms.entity.SpuLadder;
import com.wans.mall.sms.service.SpuLadderService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.common.utils.Resp;

/**
 * 商品阶梯价格
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Api(tags = "商品阶梯价格 管理")
@RestController
@RequestMapping("sms/spuladder")
public class SpuLadderController {
    @Autowired
    private SpuLadderService spuLadderService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:spuladder:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = spuLadderService.queryPage(queryCondition);
        return Resp.ok(page);
    }

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:spuladder:info')")
    public Resp<SpuLadder> info(@PathVariable("id") Long id){
        SpuLadder spuLadder = spuLadderService.getById(id);
        return Resp.ok(spuLadder);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:spuladder:save')")
    public Resp<Object> save(@RequestBody SpuLadder spuLadder){
        spuLadderService.save(spuLadder);
        return Resp.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:spuladder:update')")
    public Resp<Object> update(@RequestBody SpuLadder spuLadder){
        spuLadderService.updateById(spuLadder);
        return Resp.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:spuladder:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        spuLadderService.removeByIds(Arrays.asList(ids));
        return Resp.ok();
    }

}
