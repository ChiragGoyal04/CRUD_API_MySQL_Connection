package com.chirag.mysql_rest_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;
    private String city;
    private String state;
    private String gender;

    //id
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }

    //name
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    //age
    public void setAge(Integer age){
        this.age=age;
    }
    public Integer getAge(){
        return age;
    }

    //city
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }

    //state
    public void setState(String state){
        this.state=state;
    }
    public String getState(){
        return state;
    }

    //gender
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
}
