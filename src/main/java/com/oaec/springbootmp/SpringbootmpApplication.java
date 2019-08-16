package com.oaec.springbootmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oaec.springbootmp.mapper")
public class SpringbootmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmpApplication.class, args);
    }

}
