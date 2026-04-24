package com.chirag.mysql_rest_api.service;

import com.chirag.mysql_rest_api.entity.Citizen;
import com.chirag.mysql_rest_api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImplementation {

    @Autowired
    public StudentRepository studentRepository;

    public List<Citizen> getAllCitizens() {

        return studentRepository.findAll();
    }

    public Citizen fetchCitizenById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public boolean addCitizen(Long id, Citizen citizen) {
        studentRepository.save(citizen);
        return true;
    }

    public boolean removeCitizen(Long id) {
        studentRepository.deleteById(id);
        return true;
    }

    public String updateCitizen(Long id, Citizen newCitizen) {

        Citizen old = studentRepository.findById(id).orElse(null);
        if(old != null) {

            if(newCitizen.getName() != null) {
                old.setName(newCitizen.getName());
            }
            if(newCitizen.getAge() > 0 ) {
                old.setAge(newCitizen.getAge());
            }
            if(newCitizen.getCity() != null) {
                old.setCity(newCitizen.getCity());
            }
            if(newCitizen.getState() != null) {
                old.setState(newCitizen.getState());
            }
            if(newCitizen.getGender() != null) {
                old.setGender(newCitizen.getGender());
            }
        }
        studentRepository.save(old);
        return "citizen successfully updated";
    }

}
