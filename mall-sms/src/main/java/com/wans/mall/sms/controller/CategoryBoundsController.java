package com.wans.mall.sms.controller;
import java.util.Arrays;
import java.util.Map;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.wans.mall.sms.entity.CategoryBounds;
import com.wans.mall.sms.service.CategoryBoundsService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.common.utils.Resp;

/**
 * 商品分类积分设置
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Api(tags = "商品分类积分设置 管理")
@RestController
@RequestMapping("sms/categorybounds")
public class CategoryBoundsController {
    @Autowired
    private CategoryBoundsService categoryBoundsService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:categorybounds:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = categoryBoundsService.queryPage(queryCondition);
        return Resp.ok(page);
    }

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:categorybounds:info')")
    public Resp<CategoryBounds> info(@PathVariable("id") Long id){
        CategoryBounds categoryBounds = categoryBoundsService.getById(id);
        return Resp.ok(categoryBounds);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:categorybounds:save')")
    public Resp<Object> save(@RequestBody CategoryBounds categoryBounds){
        categoryBoundsService.save(categoryBounds);
        return Resp.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:categorybounds:update')")
    public Resp<Object> update(@RequestBody CategoryBounds categoryBounds){
        categoryBoundsService.updateById(categoryBounds);
        return Resp.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:categorybounds:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        categoryBoundsService.removeByIds(Arrays.asList(ids));
        return Resp.ok();
    }

}
