package com.dtcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.dtcc.beans.MyBean;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
		MyBean bean = context.getBean("myBean", MyBean.class);
		bean.test();
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for(String tempName : beanDefinitionNames) {
			System.out.println(tempName);
		}
	}

}
