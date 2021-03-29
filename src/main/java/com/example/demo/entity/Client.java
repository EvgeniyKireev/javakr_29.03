package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
@Data
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<Task> task;

    private String firstname;
    private String lastname;
    private String login;
    private String patronymic;
    private String birthday;
    private String datatostart;
    private String dateofupdate;


}
