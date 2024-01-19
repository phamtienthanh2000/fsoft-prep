package com.tienthanh.managementapp.controller;

import com.tienthanh.managementapp.entity.Employee;
import com.tienthanh.managementapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("")
    public List<Employee> getAllEmployee(){
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee getByEmployeeId(@PathVariable(name = "id") int id){
        return employeeService.findById(id);
    }

    @PostMapping("")
    public Employee createEmployee(Employee employee){
        return null;
    }

    @GetMapping("/per-page")
    public Page<Employee> getEmployeeOfPage(@RequestParam  int employeePerPage , @RequestParam int pageNumber ){

        return employeeService.getEmployeeForPage(employeePerPage,pageNumber);
    }




}
