package com.example.clinicEc2.controller;

import com.example.clinicEc2.entity.OwnerEntity;
import com.example.clinicEc2.entity.PetsEntity;
import com.example.clinicEc2.model.Pets;
import com.example.clinicEc2.model.Response;
import com.example.clinicEc2.model.ResponseOwner;
//import com.example.clinicEc2.repo.OwnerRepo;
//import com.example.clinicEc2.repo.PetsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping("/app")
public class AppController {

    private Map<Integer, PetsEntity> mapPets(){
        Map<Integer, PetsEntity> petsMap = new HashMap<>();
        petsMap.put(1,new PetsEntity(1,"lukas","Brown",20,"Luis"));
        return petsMap;
    }

//    @Autowired
//    private PetsRepo petsRepo;
//
//    @Autowired
//    private OwnerRepo ownerRepo;
//    @GetMapping("/allpets")
//    public Response getAllPets(){
//        Collection<PetsEntity> pets2 = petsRepo.findAll();
//        return new Response(HttpStatus.OK.value(), pets2);
//    }
    @GetMapping("/allpets")
    public Response getAllPets(){
        Collection<PetsEntity> pets = mapPets().values();
        return new Response(HttpStatus.OK.value(), pets);
    }

//    @GetMapping("/allowner")
//    public ResponseOwner getAllOwners(){
//        Collection<OwnerEntity> owner = ownerRepo.findAll();
//        return new ResponseOwner(HttpStatus.OK.value(), owner);
//    }
////
//    @GetMapping("/pet/{idpet}")
//    public Optional<PetsEntity> getOnepet(@PathVariable Integer idpet){
//        return petsRepo.findById(idpet);
////        return new Response(HttpStatus.OK.value(),petA);
//
//    }
////
//    @GetMapping("/{id}")
//    public Optional<OwnerEntity> getOneOwner(@PathVariable Integer id){
//        return ownerRepo.findById(id);
//
//    }
}
