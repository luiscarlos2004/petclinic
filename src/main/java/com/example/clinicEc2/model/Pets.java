package com.example.clinicEc2.model;

public class Pets{

    private Integer peid;
    private String name;
    private String color;
    private Integer age;
    private String owner;

    public Pets(Integer peid, String name, String color, Integer age, String owner) {
        this.peid = peid;
        this.name = name;
        this.color = color;
        this.age = age;
        this.owner = owner;
    }

    public Pets(){

    }

    public Integer getPeid() {
        return peid;
    }

    public void setPeid(Integer peid) {
        this.peid = peid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "peid=" + peid +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }
}
