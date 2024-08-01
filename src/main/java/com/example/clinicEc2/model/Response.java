package com.example.clinicEc2.model;

import com.example.clinicEc2.entity.PetsEntity;

import java.util.Collection;

public class Response {
    private int code;
    private Collection<PetsEntity> pets;

    public Response(int code, Collection<PetsEntity> pets) {
        this.code = code;
        this.pets = pets;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Collection<PetsEntity> getPets() {
        return pets;
    }

    public void setPets(Collection<PetsEntity> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", pets=" + pets +
                '}';
    }
}
