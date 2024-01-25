package com.tienthanh.managementapp.controller;

import com.tienthanh.managementapp.entity.DepartmentEmployee;
import com.tienthanh.managementapp.repository.DepartmentRepository;
import com.tienthanh.managementapp.service.DepartmentEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("department-employee")
public class DepartmentEmployeeController {

    @Autowired
    DepartmentEmployeeService service;

    @GetMapping("")
    public List<DepartmentEmployee> findAll(){
        return service.findAll();
    }
}
