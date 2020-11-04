package com.tff.gmall.manger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.tff.gmall.manger.mapper")
public class GmallMangerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallMangerServiceApplication.class, args);
    }

}
