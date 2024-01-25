package com.tienthanh.managementapp.service;

import com.tienthanh.managementapp.entity.Employee;
import com.tienthanh.managementapp.entity.EmployeeDTO;
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
       return null;
    }

    public Employee findById(Integer id){
       return employeeRepository.findById(id);
    }

    public Employee save(Employee employee){
        return null;
    }

    // mục đích viết 1 câu query lấy tất cả employee của 1 trang,
    public Page<Employee> getEmployeeForPage(int employeePerPage ,int pageNumber){
//        Pageable pageable  = PageRequest.of(pageNumber-1,employeePerPage, Sort.by("firstName").descending());
//        Page<Employee> page =employeeRepository.findAll(pageable);
//        Slice<Employee> employeeSlice =  employeeRepository.findAll(pageable);
        return null;
    }
    // Viết 1 câu query lấy 100 bản ghi , pagination xem các page
    // -> limit 100
//    public Page<Employee> findByLastNameLimitAndPagination(int employeePerPage ,int pageNumber){
//        Pageable pageable  = PageRequest.of(pageNumber-1,employeePerPage);
//    }

    // findByLastName trả về 1 vài thuộc tính của bảng Employee

    public List<EmployeeDTO> findByLastName(String lastName){
        return employeeRepository.findByLastName(lastName);
    }



}
