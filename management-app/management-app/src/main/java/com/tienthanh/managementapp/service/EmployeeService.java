package com.tienthanh.managementapp.service;

import com.tienthanh.managementapp.entity.Employee;
import com.tienthanh.managementapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
       return employeeRepository.findAll();
    }

    public Employee findById(Integer id){
       return employeeRepository.findById(id).orElse(null);
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    // mục đích viết 1 câu query lấy tất cả employee của 1 trang,
    public Page<Employee> getEmployeeForPage(int employeePerPage ,int pageNumber){
        Pageable pageable  = PageRequest.of(pageNumber-1,employeePerPage, Sort.by("firstName").descending());
        Page<Employee> page =employeeRepository.findAll(pageable);
        Slice<Employee> employeeSlice =  employeeRepository.findAll(pageable);
        return page;
    }

    public Page<Employee> findByLastNameLimitAndPagination(int employeePerPage ,int pageNumber){
        Pageable pageable  = PageRequest.of(pageNumber-1,employeePerPage);
        pageable.toLimit();


    }



}
