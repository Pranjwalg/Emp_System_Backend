package com.emp.emp_sytm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Empname")
    private String name;
   

private String address;
    // private String phone;
 private String salary;
    // private String position;
    @Transient
    private String message;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    // public Employee(int id, String name, String email, String address, String phone, String salary, String position,
    //         String message) {
    //     this.id = id;
    //     this.name = name;
    //     this.email = email;
    //     this.address = address;
    //     this.phone = phone;
    //     this.salary = salary;
    //     this.position = position;
    //     this.message = message;
    // }

    // public Employee() {
    // }

    // public int getId() {
    //     return id;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    // public void setAddress(String address) {
    //     this.address = address;
    // }

    // public void setPhone(String phone) {
    //     this.phone = phone;
    // }

    // public void setSalary(String salary) {
    //     this.salary = salary;
    // }

    // public void setPosition(String position) {
    //     this.position = position;
    // }

    // public void setMessage(String message) {
    //     this.message = message;
    // }

    // public String getEmail() {
    //     return email;
    // }

    // public String getAddress() {
    //     return address;
    // }

    // public String getPhone() {
    //     return phone;
    // }

    // public String getSalary() {
    //     return salary;
    // }

    // public String getPosition() {
    //     return position;
    // }

    // public String getMessage() {
    //     return message;
    // }

    

}
