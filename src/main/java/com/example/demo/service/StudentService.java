package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService {

    private static HashMap<Integer, Student>studentHashMap=new HashMap<>();

    public StudentService(){
        studentHashMap=new HashMap<>();
        Student student1=Student.builder()
                .address("Fatih")
                .name("Zahit")
                .id(10)
                .build();
        Student student2=Student.builder()
                .address("Merkez")
                .name("Emre")
                .id(4)
                .build();

        studentHashMap.put(student1.getId(),student1);
        studentHashMap.put(student2.getId(),student2);

    }

    public static int getMaximumId() {
        int max = 0;
        for (int id : studentHashMap.keySet()) {
            if (max <= id) {
                max = id;
            }
        }
        return max;
    }

    public List<Student> getAllStudents(){
        List <Student>students=new ArrayList<>(studentHashMap.values());
        return students;
    }

    public Student addStudent(Student student){
        studentHashMap.put(student.getId(),student);
        return student;
    }

   public Student updateStudent(Student student,int id){
        student.setId(id);
        studentHashMap.put(id,student);
       return student;
   }

   public void deleteStudent(int id){
        studentHashMap.remove(id);
   }





}
