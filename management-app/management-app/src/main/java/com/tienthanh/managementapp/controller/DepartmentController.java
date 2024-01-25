package com.tienthanh.managementapp.controller;

import com.tienthanh.managementapp.entity.Department;
import com.tienthanh.managementapp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("")
    public List<Department> getAll(){
        return departmentService.findAll();
    }
}
