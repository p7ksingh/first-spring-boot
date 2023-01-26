package com.dtcc.beans;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class MyBean {

	public void test() {
		
		System.out.println("spring boot rocks !! from mybean");
	}
	
	
	
}
