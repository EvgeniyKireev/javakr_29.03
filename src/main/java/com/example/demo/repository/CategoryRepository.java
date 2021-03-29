package com.example.demo.repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
