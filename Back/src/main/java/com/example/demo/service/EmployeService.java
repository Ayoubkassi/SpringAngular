/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ryota
 */
@Service
public class EmployeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
    
    
}
