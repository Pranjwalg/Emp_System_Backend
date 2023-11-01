package com.emp.emp_sytm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.emp_sytm.model.Employee;
import com.emp.emp_sytm.repository.Emprep;

@Service
public class Empservice {
    @Autowired
    Emprep rep;

    public Employee saveEmployee(Employee emp) {
        Employee em = null;
        try {
          em=  rep.save(emp);
            em.setMessage("Employee saved successfully");

        } catch (Exception e) {
            e.printStackTrace();
            em.setMessage("Employee not saved");

        }
        return em;
    }

    public Iterable<Employee> getAllEmployee() {
        Iterable<Employee> em = null;
        try {
            em = rep.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return em;
    }

    public Employee getEmployeeById(int id) {
        Employee em = null;
        try {
            em = rep.findById(id).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return em;
    }

    // public Employee updateEmployee(int id,Employee emp){
    // Employee em=null;
    // try{
    // em= rep.findById(id).get();
    // em.setName(emp.getName());
    // em.setEmail(emp.getEmail());
    // em.setAddress(emp.getAddress());
    // em.setPhone(emp.getPhone());
    // em.setSalary(emp.getSalary());
    // em.setPosition(emp.getPosition());
    // em= rep.save(em);
    // em.setMessage("Employee updated successfully");
    // }
    // catch(Exception e){
    // e.printStackTrace();
    // emp.setMessage("Employee not updated");
    // }
    // return em;
    // }
    public Employee deleteEmployee(int id) {
        Employee em = null;
       
        try {
            em = rep.findById(id).get();
            rep.deleteById(id);
            em.setMessage("Employee deleted successfully");
        } catch (Exception e) {
            e.printStackTrace();
            em.setMessage("Employee not deleted");
        }
        return em;
    }

    public List<Employee> getEmployeeByName(String name) {
        List<Employee> em = null;
        try {
            em = rep.findByName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return em;

    }

    public void deleteall() {
        try {
            rep.deleteAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}