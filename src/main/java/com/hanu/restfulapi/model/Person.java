package com.hanu.restfulapi.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.UUID;

public class Person {
    private UUID id;
    private String name ;
    private int age;
    private Date creatAt;
    private Date updateAt;
    private Date deleteAt;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name,
                  @JsonProperty("age") int age,@JsonProperty("createAt") Date creatAt,
                  @JsonProperty("updateAt") Date updateAt, @JsonProperty("deleteAt") Date deleteAt) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.creatAt = creatAt;
        this.updateAt = updateAt;
        this.deleteAt = deleteAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(Date deleteAt) {
        this.deleteAt = deleteAt;
    }
}
