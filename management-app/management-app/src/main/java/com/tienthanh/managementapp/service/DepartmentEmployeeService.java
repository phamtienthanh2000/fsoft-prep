package com.tienthanh.managementapp.service;

import com.tienthanh.managementapp.entity.DepartmentEmployee;
import com.tienthanh.managementapp.repository.DepartmentEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentEmployeeService {
    @Autowired
    DepartmentEmployeeRepository repository;

    public List<DepartmentEmployee> findAll(){
        return null;
    }
}
