package com.gtel.SpringBoot;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    //@GetMapping("/hello")
    public String sayHello() {
        return "Hello World from my first controller";
    }

    @GetMapping("/hello2")
    @ResponseStatus(HttpStatus.ACCEPTED)        // custom status code
    public String sayHello2() {
        return "Hello World from my first controller - part 2";
    }

    @PostMapping("/post")
    public String post(@RequestBody String message) {
        return "Request accepted. Message: " + message;
    }

    @PostMapping("/post-order")
    public String post(@RequestBody Order order) {
        return "Request accepted. Message: " + order;
    }
    @PostMapping("/post-order-record")
    public String postRecord(@RequestBody OrderRecord order) {
        return "Request accepted. Message: " + order;
    }


    // http://localhost:8080/hello/ductrung
    @GetMapping("/hello/{user-name}")
    public String pathVar(@PathVariable("user-name") String username) {
        return "My value = " + username;
    }

    // http://localhost:8080/hello?param_name=paramvalue
    @GetMapping("/hello")
    public String paramVar(@RequestParam("user-name") String username, @RequestParam("user-lastname") String lastname) {
        return "My value = " + username + " " + lastname;
    }


}
