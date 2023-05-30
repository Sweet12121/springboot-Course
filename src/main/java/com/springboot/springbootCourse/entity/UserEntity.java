package com.springboot.springbootCourse.entity;


import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "XX")

@Entity
@Getter
public class UserEntity {
     @Id
     @GeneratedValue
    private long id;
    private  String name;
    private String  role;

    protected UserEntity(){

    }

    public UserEntity( String name, String role) {

        this.name = name;
        this.role = role;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
