package com.demo.rest.controller;

import com.demo.rest.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    @GetMapping("/hi")
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/students")
    public List<Student> theList(){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Gosho","Peshev"));
        students.add(new Student("Pesho","Geshev"));
        students.add(new Student("Docho","Dochev"));
        return students;
    }
}
