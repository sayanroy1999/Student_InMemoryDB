package com.example.study1.Service;

import com.example.study1.Repository.StudentRepo;
import com.example.study1.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo sr;

    public List<Student> getAllStudents()
    {
        return sr.getAllStudents();
    }

    public void saveStudent(Student s)
    {
        sr.saveStudent(s);
    }

    public Student getStudent(int id)
    {
        return sr.getOneStudent(id);
    }

}
