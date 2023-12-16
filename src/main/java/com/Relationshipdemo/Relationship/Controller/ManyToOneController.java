package com.Relationshipdemo.Relationship.Controller;

import com.Relationshipdemo.Relationship.Model.Address;
import com.Relationshipdemo.Relationship.Service.ManyToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManyToOneController {
    @Autowired
    ManyToOne manyToOne;
    @GetMapping("/manytoone")
    public void manytoone(){
        manyToOne.manytoone();
    }
    @GetMapping("/addresslist")
    public List<Address> addressList(){
        return manyToOne.addressList();
    }
    @DeleteMapping("/deleteonetomany")
    public void delete(){
        manyToOne.delete();
    }
}
