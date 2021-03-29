package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.entity.Task;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public void create(Task task){
        taskRepository.save(task);
    }
    public List<Task> findAll(){
        return taskRepository.findAll();
    }

    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }
    public String DeleteNewsById(Long id) {
        taskRepository.deleteById(id);

        return  "Новость удалена";
    }



}
