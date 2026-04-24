package com.chirag.mysql_rest_api.repository;

import com.chirag.mysql_rest_api.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Citizen, Long> {

}
