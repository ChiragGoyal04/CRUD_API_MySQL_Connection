package com.chirag.mysql_rest_api.controller;

import com.chirag.mysql_rest_api.entity.Citizen;
import com.chirag.mysql_rest_api.service.StudentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Citizen")
public class CitizenController {

    @Autowired
    public StudentServiceImplementation studentServiceImplementation;

    @GetMapping
    public List<Citizen> fetchAllCitizens(){
        return studentServiceImplementation.getAllCitizens();
    }

    @GetMapping("{id}")
    public Citizen getCitizenById(@PathVariable Long id){
        return studentServiceImplementation.fetchCitizenById(id);
    }

    @PostMapping
    public boolean createCitizen(Long id,@RequestBody Citizen newCitizen){
        return studentServiceImplementation.addCitizen(id,newCitizen);
    }

    @DeleteMapping("{id}")
    public boolean deleteCitizenById(@PathVariable Long id){
        return studentServiceImplementation.removeCitizen(id);
    }

    @PutMapping("{id}")
    public String updateCitizneById(@PathVariable Long id, @RequestBody Citizen updateCitizen){
        return studentServiceImplementation.updateCitizen(id,updateCitizen);
    }
}
