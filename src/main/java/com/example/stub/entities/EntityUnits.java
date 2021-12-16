package com.example.stub.entities;

public class EntityUnits {

    private int id;
    private String name;
    private String grade;
    private String school_name;
    private String city;

    public EntityUnits(int id, String name, String grade, String school_name, String city) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.school_name = school_name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



}
