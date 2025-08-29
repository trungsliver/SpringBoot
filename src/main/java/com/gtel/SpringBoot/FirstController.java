package com.gtel.SpringBoot;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {
    private final StudentRepository repository;
    public FirstController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World from my first controller";
    }

    @PostMapping("/students")
    public Student post(@RequestBody Student student) {
        return repository.save(student);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return repository.findAll();
    }


}
