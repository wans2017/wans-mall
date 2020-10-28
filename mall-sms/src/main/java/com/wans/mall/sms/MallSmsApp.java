package com.wans.mall.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by wans on 2020/10/27.
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.wans.mall.*.dao")
public class MallSmsApp {
    public static void main(String[] args) {
        SpringApplication.run(MallSmsApp.class);
    }
}
