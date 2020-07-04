package com.jimang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jw
 */
@SpringBootApplication
@MapperScan("com.jimang.mapper")
public class JimangApplication {
	public static void main(String[] args) {
		SpringApplication.run(JimangApplication.class, args);
	}

}
