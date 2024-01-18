package com.tienthanh.managementapp.service;

import com.tienthanh.managementapp.entity.Employee;
import com.tienthanh.managementapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
       return employeeRepository.findAll();
    }

}
