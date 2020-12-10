package com.acq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.acq.mapper")
public class SpringBootTeam11AcqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTeam11AcqApplication.class, args);
    }

}
