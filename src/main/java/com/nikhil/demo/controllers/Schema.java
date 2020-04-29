package com.nikhil.demo.controllers;

public class Schema {

    int id;
    String FirstName;
    String LastName;
    int Age;
    String ImgURL;
    String Email;

    //Empty Constructor
    public Schema(){

    }

    public Schema(int id, String firstName, String lastName, int age, String imgURL, String email) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        ImgURL = imgURL;
        Email = email;
    }
    //setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getImgURL() {
        return ImgURL;
    }

    public void setImgURL(String imgURL) {
        ImgURL = imgURL;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
