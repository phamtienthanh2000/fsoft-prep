package com.tienthanh.managementapp.service;

import com.tienthanh.managementapp.entity.Department;
import com.tienthanh.managementapp.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    public List<Department> findAll(){
        return departmentRepository.findAll();
    }
}
