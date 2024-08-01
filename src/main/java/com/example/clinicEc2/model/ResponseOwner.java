package com.example.clinicEc2.model;

import com.example.clinicEc2.entity.OwnerEntity;

import java.util.Collection;
import java.util.List;

public class ResponseOwner {
    private int code;
    private Collection<OwnerEntity> owners;

    public ResponseOwner(int code, Collection<OwnerEntity> owners) {
        this.code = code;
        this.owners = owners;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Collection<OwnerEntity> getOwners() {
        return owners;
    }

    public void setOwners(Collection<OwnerEntity> owners) {
        this.owners = owners;
    }

    @Override
    public String toString() {
        return "ResponseOwner{" +
                "code=" + code +
                ", owners=" + owners +
                '}';
    }
}
