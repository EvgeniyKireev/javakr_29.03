package com.example.demo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryname;
    private String datatostart;
    private String dateofupdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return categoryname;
    }

    public void setName(String name) {
        this.categoryname = categoryname;
    }

    public String getDatatostart() {
        return datatostart;
    }

    public void setDatatostart(String datatostart) {
        this.datatostart = datatostart;
    }

    public String getDateofupdate() {
        return dateofupdate;
    }

    public void setDateofupdate(String dateofupdate) {
        this.dateofupdate = dateofupdate;
    }
}
