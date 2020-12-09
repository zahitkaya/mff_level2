package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class StudentController {
    StudentService studentService=new StudentService();

    @GetMapping("school/v1/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("school/v1/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return student;
    }

    @PutMapping("school/v1/students/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Student updateStudent(@RequestBody Student student,@PathVariable int id){
        studentService.updateStudent(student,id);
        return student;
    }

    @DeleteMapping("school/v1/students")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@RequestHeader int id){
        studentService.deleteStudent(id);

    }







}
