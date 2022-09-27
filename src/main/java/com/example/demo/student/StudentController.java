package com.example.demo.student;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
/*
    private static final List<Student> STUDENTS = Arrays.asList(
        new Student(1, "Keorapetse D1"),
        new Student(2, "K Dot"),
        new Student(3, "Lindani Shabangu")
    );
*/

// If GET is geven ID it will return string because of the actualName() method
/*     
    @GetMapping(path = "{studentId}")
    public String actualName(@PathVariable("studentId") Integer studentId){
        if (studentId == 33)
            return "The string IS ALIVE";
        else
            return "sdsafsdfsdf";
    }
*/
//
    @GetMapping(path = "{price}")
    public String fullTankprice(@PathVariable("price") double price){
        if (price == 4.99)
            return "The PRICE IS RIGHT!!!";
        else{
            return "NO PRICE RECORDED!!!";
        }
    }

    /* 
    public Student getStudent(@PathVariable("studentId") Integer studentId){
        /* 
        //Different Return
        return STUDENTS.stream()
        .filter(student -> studentId.equals(student.getStudentId()))
        .findFirst()
        .orElseThrow(() -> new IllegalStateException("Student " + studentId + "does not exist"));
        */
        
        /*
        //Different Return
        if ( studentId == 1)
            return new Student(studentId, "Thebe is around");
        else
            return new Student(studentId, "Thebe Not arround!");    
        */
    //}
}