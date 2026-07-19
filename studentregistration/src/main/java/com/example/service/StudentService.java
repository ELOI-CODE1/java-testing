package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.*;

public class StudentService {
    
    List<Student> StudentList = new ArrayList<>();

    public String saveStudent(Student student){
        StudentList.add(student);
        return "Student saved successfuly";
    }
}
