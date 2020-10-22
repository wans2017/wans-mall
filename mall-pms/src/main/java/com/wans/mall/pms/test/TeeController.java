package com.wans.mall.pms.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wans on 2020/10/22.
 */
@RestController
public class TeeController {

    @GetMapping("/yy")
    public String yy() {
        return "yy";
    }
}
