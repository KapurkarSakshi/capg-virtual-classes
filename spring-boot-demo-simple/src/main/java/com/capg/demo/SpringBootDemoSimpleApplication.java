package com.capg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class SpringBootDemoSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoSimpleApplication.class, args);
	}
//	@Bean
//   public InternalResourceViewResolver viewResolver() {
//	  InternalResourceViewResolver vsr= new InternalResourceViewResolver();
//	  vsr.setSuffix(".jsp");
//	  return vsr;
// }
}
