package com.tienthanh.managementapp.repository;

import com.tienthanh.managementapp.entity.Employee;
import com.tienthanh.managementapp.entity.EmployeeDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.QueryLookupStrategy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@EnableJpaRepositories(queryLookupStrategy = QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND)
public class EmployeeRepository  {

    @PersistenceContext
    private final EntityManager entityManager;

    public EmployeeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // get all employees

    // get employee by id

    // save Employee
    ndjwqnjdqkwk
    // find by lastName

    public List<EmployeeDTO> findByLastName(String lastName){
        // Quan code 1 
    };

    public List<Employee> findByLastNameJpql(String lastName){
       /**
        * 
            Quan code 2
        */ 
    }

    public List<Employee> findByFirstnameLike(String expression){
       /**
        * 

            Quan Code 3        
        */
    }

    public Employee findById(Integer id){
     // Quan code 4
    }

    public List<Employee> findEmployeeWithSalarySql(){
        //Hello From Quan machines 
    }

    public List<Employee> findEmployeeWithSalaryConditionJpql(){
        Query q = new Query() {
            
        };

        hádhasdk
        alksdjalsjdasd
        ạdslkajdlksad

    }





}
