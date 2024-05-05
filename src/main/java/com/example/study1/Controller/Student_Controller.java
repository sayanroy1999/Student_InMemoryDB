package com.example.study1.Controller;

import com.example.study1.Service.StudentService;
import com.example.study1.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class Student_Controller {

    @Autowired
    StudentService ss;

    @GetMapping
    public ResponseEntity<List<Student>> getStudents ()
    {
        return ResponseEntity.ok(ss.getAllStudents());
    }

    @PostMapping
    public void save (@RequestBody Student s)
    {
        ss.saveStudent(s);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent (@PathVariable int id)
    {
        return ResponseEntity.ok(ss.getStudent(id));
    }


}
