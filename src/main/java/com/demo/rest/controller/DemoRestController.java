package com.demo.rest.controller;

import com.demo.rest.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    private final List<Student> students = new ArrayList<>();

    @PostConstruct
    public void populateStudents() {

        students.add(new Student("Gosho", "Peshev"));
        students.add(new Student("Pesho", "Geshev"));
        students.add(new Student("Docho", "Dochev"));
    }

    @GetMapping("/hi")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/students/{id}")
    public Student theList(@PathVariable int id) {

        if (id >= students.size() || id < 0) {
            throw new StudentNotFoundException("Student not found with id " + id);
        }
        return students.get(id);
    }

}
