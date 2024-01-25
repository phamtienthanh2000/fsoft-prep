package com.tienthanh.managementapp.service;

import com.tienthanh.managementapp.entity.DepartmentManager;
import com.tienthanh.managementapp.repository.DepartmentManagerRepository;
import com.tienthanh.managementapp.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentManagerService {
    @Autowired
    private DepartmentManagerRepository departmentManagerRepository;

    public List<DepartmentManager> findAll(){
        return departmentManagerRepository.findAll();
    }
}
