package com.tienthanh.managementapp.controller;

import com.tienthanh.managementapp.entity.Employee;
import com.tienthanh.managementapp.entity.EmployeeDTO;
import com.tienthanh.managementapp.entity.EmployeeWithSalary;
import com.tienthanh.managementapp.repository.EmployeeJpaRepository;
import com.tienthanh.managementapp.repository.EmployeeRepository;
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

    @Autowired
    EmployeeRepository repository;

    @Autowired
    EmployeeJpaRepository employeeJpaRepository;

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

    @GetMapping("/get-by-lastname")
    public List<EmployeeDTO> getFirstNameAndLastNameByLastName(@RequestParam String lastName){
        return employeeService.findByLastName(lastName);
    }

    @GetMapping("/find-join")
    public List<Employee> findByIdSql(){
        return repository.findEmployeeWithSalarySql();
    }

    @GetMapping("/find-join-jpa")
    public List<EmployeeWithSalary> findByIdjoinjpa(){
        return employeeJpaRepository.findCustom();
    }




}
