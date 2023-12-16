package com.Relationshipdemo.Relationship.Service;

import com.Relationshipdemo.Relationship.Model.Laptop;
import com.Relationshipdemo.Relationship.Model.Student;

import com.Relationshipdemo.Relationship.Repository.LaptopRepo;
import com.Relationshipdemo.Relationship.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private LaptopRepo laptopRepo;

    public void onttoone(){
//        Laptop l1=new Laptop();
//        l1.setLaptopBrand("brand1");
//        l1.setLaptopModel("model1");
        Student s1=new Student();
        s1.setAge(20);
//        l1.setStudent(s1);
//
        s1.setStudentName("bc");

        s1.setLaptop(laptopRepo.findById(2).get());
//        s1.setLaptop(l1);
//        laptopRepo.save(l1);
        studentRepo.save(s1);





    }
    public void delete (){
        laptopRepo.deleteById(2);
    }

    public void getinfo() {
        System.out.println(laptopRepo.findById(1).get().getStudent());
    }
}
