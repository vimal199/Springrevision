package com.spring.essential.com.infosys.config;

import com.spring.essential.com.infosys.demo.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Customer customer(){
        return new Customer();
    }
}
