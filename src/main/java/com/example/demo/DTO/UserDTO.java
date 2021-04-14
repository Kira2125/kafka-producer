package com.example.demo.DTO;

import lombok.Data;


public class UserDTO {
    private Long id;
    private Long age;
    private String name;

    public UserDTO() {
    }

    public UserDTO(Long id, Long age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
