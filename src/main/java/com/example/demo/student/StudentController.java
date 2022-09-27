package com.example.demo.student;

import java.util.List;
import java.util.Arrays;

//import org.apache.tomcat.util.http.fileupload.util.Streams;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    
    private static final List<Student> STUDENTS = Arrays.asList(
        new Student(1, "Keorapetse D1"),
        new Student(2, "K Dot"),
        new Student(3, "Lindani Shabangu")
    );

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId){
        
        return STUDENTS.stream()
        .filter(student -> studentId.equals(student.getStudentId()))
        .findFirst()
        .orElseThrow(() -> new IllegalStateException("Student " + studentId + "does not exist"));
    }
}