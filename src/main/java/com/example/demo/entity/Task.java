package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;

    @ManyToMany (fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Set<Category> categories;


    private String taskname, description, dateofcom, category, datatostart, dateofupdate;
    private boolean performed;

}
