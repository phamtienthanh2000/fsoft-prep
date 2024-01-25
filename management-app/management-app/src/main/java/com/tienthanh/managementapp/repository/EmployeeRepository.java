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
    // find by lastName

    public List<EmployeeDTO> findByLastName(String lastName){
        return null;
    };

    public List<Employee> findByLastNameJpql(String lastName){
        System.out.println("call repository" );
        Query query = entityManager.createQuery("Select e From Employee e Where e.lastName = :lastName");
        query.setParameter("lastName",lastName);
        List<Employee>employees= query.getResultList();
        return employees;
    }

    public List<Employee> findByFirstnameLike(String expression){
        Query query = entityManager.createQuery("Select e From Employee e Where e.firstName like :expression ");
        query.setParameter("expression","%"+expression+"%");
        List<Employee> result = query.getResultList();

        return result;
    }

    public Employee findById(Integer id){
        Query query =endưnqjdnwkqndw
        // thanh pt code

        Employee employee = (Employee) query.getSingleResult();
        return employee;
    }

    public List<Employee> findEmployeeWithSalarySql(){
        Query query  = entityManager.createNativeQuery("Select * From employee e Inner Join salaries s On e.emp_no = s.emp_no");
        // thanh pt code
        List<Employee> result =  query.getResultList();
        return result;
    }

    public List<Employee> findEmployeeWithSalaryConditionJpql(){
        Query query  = entityManager.createQuery("Select e From Employee e Where e.salaries is not empty");
        List<Employee> result = query.getResultList();
        System.out.println("result "+result);
        // thanh pt code

        return null;
    }





}
