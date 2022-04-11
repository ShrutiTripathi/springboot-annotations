package com.shruti.springbootannotations.config;


import com.shruti.springbootannotations.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {

    @Bean
    public TestBean testBean(){
        return new TestBean();
    }

}
