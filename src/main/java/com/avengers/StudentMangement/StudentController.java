package com.avengers.StudentMangement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;



@RestController
public class StudentController {

    Map<Integer,Student> db=new HashMap<>();

    //get information
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("adminNo") int adminNo){
        return db.get(adminNo);
    }

    //addding information
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){

        int adminNo=student.getAdminNo();
        db.put(adminNo,student);
        return "Student added successfully";
    }
}
