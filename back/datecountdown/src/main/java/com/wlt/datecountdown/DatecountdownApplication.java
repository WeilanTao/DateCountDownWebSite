package com.wlt.datecountdown;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wlt.datecountdown.dao")
public class DatecountdownApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatecountdownApplication.class, args);
	}

}
