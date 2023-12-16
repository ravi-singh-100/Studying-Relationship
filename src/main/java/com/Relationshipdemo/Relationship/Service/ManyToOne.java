package com.Relationshipdemo.Relationship.Service;

import com.Relationshipdemo.Relationship.Model.Address;
import com.Relationshipdemo.Relationship.Model.Student;
import com.Relationshipdemo.Relationship.Repository.AddressRepo;
import com.Relationshipdemo.Relationship.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ManyToOne {
    @Autowired
    StudentRepo studentRepo;
@Autowired
    AddressRepo addressRepo;
    public void manytoone() {
        Student s1=new Student();
        s1.setStudentName("ravi5");
        s1.setAge(22);
        Address a1=new Address();
a1.setCountry("india");
a1.setStudent(s1);
a1.setStreet("dakjda");
a1.setCompleteAddress("sadjfsdjn");
a1.setStudent(s1);
List<Address>as=new ArrayList<>();
as.add(a1);
s1.setAddress(as);
        studentRepo.save(s1);
//addressRepo.save(a1);
    }

    public List<Address> addressList(){
        return studentRepo.findById(1).get().getAddress();
    }
    public void delete(){
        studentRepo.deleteById(1);
    }
}
