package com.Relationshipdemo.Relationship.Repository;

import com.Relationshipdemo.Relationship.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
