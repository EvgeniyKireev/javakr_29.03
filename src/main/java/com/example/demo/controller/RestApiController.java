package com.example.demo.controller;

import com.example.demo.DTO.PersonUpdateDto;
import com.example.demo.entity.Category;
import com.example.demo.entity.Client;
import com.example.demo.entity.Task;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.TaskRepository;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ClientService;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestApiController {
    private final CategoryService categoryService;
    private final ClientService clientService;
    private final TaskService taskService;
    @Autowired
    public RestApiController(CategoryService categoryService, ClientService clientService, TaskService taskService) {
        this.categoryService = categoryService;
        this.clientService = clientService;
        this.taskService = taskService;
    }


    // clients
    @GetMapping(value = "/api/clients")
    public ResponseEntity<List<Client>> findAllClients(){
            final List<Client> newsList = clientService.findAll();

        return newsList != null && !newsList.isEmpty()
                ? new ResponseEntity<>(newsList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/api/clients")
    public ResponseEntity<?> createClient(@RequestBody Client client){
        clientService.create(client);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping(value = "/api/clients/{id}")
    public ResponseEntity<String> DeleteClientsById(@PathVariable(name = "id") Long id) {
        String message = clientService.DeleteNewsById(id);

        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    // category
    @GetMapping(value = "/api/category")
    public ResponseEntity<List<Category>> findAllCategories(){
        final List<Category> newsList = categoryService.findAll();

        return newsList != null && !newsList.isEmpty()
                ? new ResponseEntity<>(newsList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping(value = "/api/category")
    public ResponseEntity<?> createCategory(@RequestBody Category category){
        categoryService.create(category);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping(value = "/api/category/{id}")
    public ResponseEntity<String> DeleteCategoryById(@PathVariable(name = "id") Long id) {
        String message = categoryService.DeleteNewsById(id);

        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    //tasks
    @GetMapping(value = "/api/tasks")
    public ResponseEntity<List<Task>> findAllTasks(){
        final List<Task> newsList = taskService.findAll();

        return newsList != null && !newsList.isEmpty()
                ? new ResponseEntity<>(newsList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping(value = "/api/tasks")
    public ResponseEntity<?> createTasks(@RequestBody Task task){
        taskService.create(task);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/api/tasks/{id}")
    public ResponseEntity<String> DeleteTasksById(@PathVariable(name = "id") Long id) {
        String message = taskService.DeleteNewsById(id);

        return new ResponseEntity<>(message, HttpStatus.OK);
    }




}
