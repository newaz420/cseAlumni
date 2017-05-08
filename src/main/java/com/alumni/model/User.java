package com.alumni.model;

import org.springframework.beans.factory.annotation.Value;

import javax.validation.Valid;

/**
 * Created by newaz on 5/7/17.
 */
public class User {

    private Integer id;
    private String userName;
    private String fullName;
    private Integer batch;
    private String company;
    private String position;

    public User() {

    }

    public User(Integer id, String userName, String fullName) {
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
    }

    public User(Integer id, String userName, String fullName, Integer batch, String company, String position) {
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
        this.batch = batch;
        this.company = company;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
