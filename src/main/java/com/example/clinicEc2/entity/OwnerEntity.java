package com.example.clinicEc2.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

//@Entity
public class OwnerEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer owid;
    private String name;
    private String email;
    private Integer cellphone;
    private String pets;

    public OwnerEntity(Integer owid, String name, String email, Integer cellphone, String pets) {
        this.owid = owid;
        this.name = name;
        this.email = email;
        this.cellphone = cellphone;
        this.pets = pets;
    }
    public OwnerEntity(){

    }

    public Integer getOwid() {
        return owid;
    }

    public void setOwid(Integer owid) {
        this.owid = owid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCellphone() {
        return cellphone;
    }

    public void setCellphone(Integer cellphone) {
        this.cellphone = cellphone;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "OwnerEntity{" +
                "owid=" + owid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cellphone=" + cellphone +
                ", pets='" + pets + '\'' +
                '}';
    }
}
