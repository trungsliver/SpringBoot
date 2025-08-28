package com.gtel.SpringBoot;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;

public class MyFirstService {

    private MyFirstClass myFirstClass;

    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellStory() {
        return "The dependency is injected via constructor: " + myFirstClass.sayHello();
    }
}
