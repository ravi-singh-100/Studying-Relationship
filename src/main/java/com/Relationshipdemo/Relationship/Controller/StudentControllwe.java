package com.Relationshipdemo.Relationship.Controller;

import com.Relationshipdemo.Relationship.Service.OnetoOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllwe {
    @Autowired
    OnetoOneService studentService;
    @GetMapping("/onetoone")
    public void onetoone(){
        studentService.onttoone();
    }
    @GetMapping("/getinfo")
    public void getinfo(){
         studentService.getinfo();
    }
    @DeleteMapping ("/delete")
    public void delete(){
        studentService.delete();
    }
}
