package com.emp.emp_sytm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.emp.emp_sytm.model.Employee;

public interface Emprep extends CrudRepository<Employee,Integer>{

    public List<Employee> findByName(String name);
} 
