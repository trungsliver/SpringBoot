package com.gtel.SpringBoot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

//        SpringApplication.run(Application.class, args);
        var ctx = SpringApplication.run(Application.class, args);

//        MyFirstClass myFirstClass = new MyFirstClass();
        MyFirstClass myFirstClass = ctx.getBean(MyFirstClass.class);
        System.out.println(myFirstClass.sayHello());

        MyFirstService myFirstService = ctx.getBean("bean2", MyFirstService.class);
        System.out.println(myFirstService.tellStory());
	}



}
