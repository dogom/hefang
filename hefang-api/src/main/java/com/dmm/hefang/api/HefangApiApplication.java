package com.dmm.hefang.api;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.dmm.hefang.api","com.dmm.hefang.db"})
@MapperScan("com.dmm.hefang.db.dao")
@EnableTransactionManagement
public class HefangApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(HefangApiApplication.class, args);
    }
}
