package com.Relationshipdemo.Relationship.Controller;


import com.Relationshipdemo.Relationship.Service.ManyToManyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManyToManyController {
    @Autowired
    ManyToManyService manyToManyService;
    @GetMapping("/manytomany")
    public void manytomany(){
        manyToManyService.manytomany();
    }
}
