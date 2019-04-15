package com.jnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.jnote.service")
public class JnoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(JnoteApplication.class, args);
    }

}
