package org.example.student;

import org.example.student.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @GetMapping("student")
    @ResponseBody
    public List<Student> getStudent1(
            @RequestParam(value = "name", defaultValue = "sang", required = false) String name,
            @RequestParam(value = "age", defaultValue = "12", required = false) Integer age){
        List<Student> students = new ArrayList<>();
        students.add(new Student(name, age));

        return students;
    }

    @GetMapping("student/{name}/{age}")
    @ResponseBody
    public List<Student> getStudent2(
            @PathVariable(value = "name") String name,
            @PathVariable(value = "age") Integer age){
        List<Student> students = new ArrayList<>();
        students.add(new Student(name, age));
        return students;
    }

    @GetMapping("student/{name}/{age}")
    @ResponseBody
    public List<Student> getStudent2( @RequestBody Student student){
        List<Student> students = new ArrayList<>();
        students.add(student);
        return students;
    }



}
