package com.example.study1.Repository;

import com.example.study1.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepo {
    HashMap<Integer, Student> db= new HashMap<>();

    int id=1;

    public List<Student> getAllStudents()
    {
        return db.values().stream().collect(Collectors.toList());
    }


    public void saveStudent(Student s)
    {
        db.put(id,s);
        id++;
    }

    public Student getOneStudent(int id)
    {
        //System.out.println(db);
        return db.get(id);
    }


}
