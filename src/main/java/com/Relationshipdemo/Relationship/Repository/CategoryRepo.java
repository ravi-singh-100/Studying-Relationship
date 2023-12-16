package com.Relationshipdemo.Relationship.Repository;

import com.Relationshipdemo.Relationship.Model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
