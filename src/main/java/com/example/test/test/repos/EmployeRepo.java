package com.example.test.test.repos;

import org.springframework.data.repository.CrudRepository;


import com.example.test.test.modules.Employe;

public interface EmployeRepo extends CrudRepository<Employe, Integer> {

}
