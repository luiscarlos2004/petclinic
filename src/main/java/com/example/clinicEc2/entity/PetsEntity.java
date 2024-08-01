package com.example.clinicEc2.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

//@Entity
public class PetsEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer peid;
    private String name;
    private String color;
    private Integer age;
    private String owner;

    public PetsEntity(Integer peid, String name, String color, Integer age, String owner) {
        this.peid = peid;
        this.name = name;
        this.color = color;
        this.age = age;
        this.owner = owner;
    }

    public PetsEntity(){

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
        return "PetsEntity{" +
                "peid=" + peid +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }
}
