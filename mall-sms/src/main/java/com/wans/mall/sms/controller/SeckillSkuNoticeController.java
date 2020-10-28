package com.wans.mall.sms.controller;
import java.util.Arrays;
import java.util.Map;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.wans.mall.sms.entity.SeckillSkuNotice;
import com.wans.mall.sms.service.SeckillSkuNoticeService;
import com.wans.common.utils.PageVo;
import com.wans.common.utils.QueryCondition;
import com.wans.common.utils.Resp;

/**
 * 秒杀商品通知订阅
 *
 * Created by wans on 2020-10-27 16:20:17.
 */
@Api(tags = "秒杀商品通知订阅 管理")
@RestController
@RequestMapping("sms/seckillskunotice")
public class SeckillSkuNoticeController {
    @Autowired
    private SeckillSkuNoticeService seckillSkuNoticeService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:seckillskunotice:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = seckillSkuNoticeService.queryPage(queryCondition);
        return Resp.ok(page);
    }

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:seckillskunotice:info')")
    public Resp<SeckillSkuNotice> info(@PathVariable("id") Long id){
        SeckillSkuNotice seckillSkuNotice = seckillSkuNoticeService.getById(id);
        return Resp.ok(seckillSkuNotice);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:seckillskunotice:save')")
    public Resp<Object> save(@RequestBody SeckillSkuNotice seckillSkuNotice){
        seckillSkuNoticeService.save(seckillSkuNotice);
        return Resp.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:seckillskunotice:update')")
    public Resp<Object> update(@RequestBody SeckillSkuNotice seckillSkuNotice){
        seckillSkuNoticeService.updateById(seckillSkuNotice);
        return Resp.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:seckillskunotice:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        seckillSkuNoticeService.removeByIds(Arrays.asList(ids));
        return Resp.ok();
    }

}
