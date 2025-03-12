package com.spring.essential;

import com.spring.essential.com.infosys.config.SpringConfig;
import com.spring.essential.com.infosys.demo.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EssentialApplication {

	public static void main(String[] args) {

		//SpringApplication.run(EssentialApplication.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		Customer customer = applicationContext.getBean(Customer.class);
		customer.setCustomerName("Alex");
		System.out.println(customer.registerCustomer(customer.getCustomerName()));

	}

}
