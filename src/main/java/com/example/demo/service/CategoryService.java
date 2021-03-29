package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Client;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public void create(Category category){
        categoryRepository.save(category);
    }
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }
    public String DeleteNewsById(Long id) {
        categoryRepository.deleteById(id);

        return  "Новость удалена";
    }



}
