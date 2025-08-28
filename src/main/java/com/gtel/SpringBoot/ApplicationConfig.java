package com.gtel.SpringBoot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    @Primary
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("first bean");
    }

    @Bean("bean2")
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("second bean");
    }
}
