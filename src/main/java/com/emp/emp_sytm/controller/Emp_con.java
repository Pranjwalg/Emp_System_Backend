package com.emp.emp_sytm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.emp_sytm.model.Employee;
import com.emp.emp_sytm.services.Empservice;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class Emp_con {
    @Autowired
   Empservice service;
    @PostMapping("/emp")
    public Employee saveEmployee(@RequestBody Employee emp){

        return service.saveEmployee(emp);
    }
    @GetMapping("/emp")
    public Iterable<Employee> getAllEmployee(){
        return service.getAllEmployee();
    }
    @GetMapping("/emp/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }

// @PutMapping("/emp/{id}")
// public Employee updateEmployee(@PathVariable int id,@RequestBody Employee emp){
//     return service.updateEmployee(id,emp);

// }
@DeleteMapping("/emp/{id}")
public Employee deleteEmployee(@PathVariable int id){
  return service.deleteEmployee(id);
}
@DeleteMapping("/emp")
public  void deleteAllEmployee(){
    service.deleteall();

}
}