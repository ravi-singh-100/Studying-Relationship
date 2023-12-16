package com.Relationshipdemo.Relationship.Service;

import com.Relationshipdemo.Relationship.Model.Category;
import com.Relationshipdemo.Relationship.Model.Product;
import com.Relationshipdemo.Relationship.Repository.CategoryRepo;
import com.Relationshipdemo.Relationship.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManyToManyService {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    CategoryRepo categoryRepo;
    public void manytomany(){


        Product p1=new Product();
        p1.setProductName("product1");
        Product p2=new Product();
        p2.setProductName("product2");
        Product p3=new Product();
        p3.setProductName("product3");

        Category c1=new Category();
        c1.setTitle("category1");
        Category c2=new Category();
        c2.setTitle("category2");

        List<Product>c1p=c1.getProducts();
        c1p.add(p1);
        c1p.add(p2);
        c1p.add(p3);
        List<Product> c2p=c2.getProducts();
        c2p.add(p1);
        c2p.add(p3);

        categoryRepo.save(c1);
        categoryRepo.save(c2);

    }
    public List<Category> clist(){
        return productRepo.findById(1).get().getCategories();
    }
    public  List<Product>plist(){
        return  categoryRepo.findById(1).get().getProducts();
    }
}
