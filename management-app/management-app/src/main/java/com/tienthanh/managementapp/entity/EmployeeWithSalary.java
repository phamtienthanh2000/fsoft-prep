package com.tienthanh.managementapp.entity;

import com.tienthanh.managementapp.enums.Gender;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeWithSalary {
    @Value("#{target.emp_no}")
    Integer getEmployeeNo();

    String getFirstName();

    String getLastName();

    LocalDate getDob();

    String getGender();

    LocalDate getHireDate();

    List<ESalary> getSalaries();


    interface ESalary{
        Integer getId();

        LocalDate getFromDate();

        LocalDate getToDate();

        int getSalary();

    }


}
