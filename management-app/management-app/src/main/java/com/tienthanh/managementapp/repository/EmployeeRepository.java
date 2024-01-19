package com.tienthanh.managementapp.repository;

import com.tienthanh.managementapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.QueryLookupStrategy;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories(queryLookupStrategy = QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND)
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    // get all employees

    // get employee by id

    // save Employee

    // find by lastName

    List<Employee> findByLastName(String lastName);



}
