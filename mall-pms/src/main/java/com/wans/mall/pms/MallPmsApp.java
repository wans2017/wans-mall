package com.wans.mall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by wans on 2020/10/21.
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.wans.mall.*.dao")
public class MallPmsApp {
    public static void main(String[] args) {
        SpringApplication.run(MallPmsApp.class);
    }
}
