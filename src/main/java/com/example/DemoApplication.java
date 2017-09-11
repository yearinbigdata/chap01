package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.dao.DeptDao;
import com.example.domain.Dept;

import lombok.extern.java.Log;

@SpringBootApplication	//빈 등록
@Log										//맵리듀스 ToolRunner와 비슷
public class DemoApplication {
	
	@Bean
	public Dept dept(){
		log.info("***");
		log.info("*** DemoApplication.dept()");
		log.info("***");
		return new Dept(90, "xxx", "yyy");
	}

	public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args).close();;
   }//실질적으로 이것을 통해서 자동으로 처리됨

   


}