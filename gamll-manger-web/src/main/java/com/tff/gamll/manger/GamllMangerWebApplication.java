package com.tff.gamll.manger;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class GamllMangerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamllMangerWebApplication.class, args);
    }

}
