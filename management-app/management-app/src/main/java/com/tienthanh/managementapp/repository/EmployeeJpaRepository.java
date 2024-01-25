package com.tienthanh.managementapp.repository;

import com.tienthanh.managementapp.entity.Employee;
import com.tienthanh.managementapp.entity.EmployeeWithSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee,Integer> {

    @Query(value = "Select *" +
            " From employee e Inner Join salaries s On e.emp_no = s.emp_no",nativeQuery = true)
    List<EmployeeWithSalary> findCustom();
//    `

}
