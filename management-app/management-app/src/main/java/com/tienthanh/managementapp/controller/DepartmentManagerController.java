package com.tienthanh.managementapp.controller;

import com.tienthanh.managementapp.entity.DepartmentManager;
import com.tienthanh.managementapp.service.DepartmentManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("department-manager")
public class DepartmentManagerController {
    @Autowired
    DepartmentManagerService departmentManagerService;

    @GetMapping("")
    public List<DepartmentManager> findAll(){
        return departmentManagerService.findAll();
    }
}
