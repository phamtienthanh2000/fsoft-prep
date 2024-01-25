package com.tienthanh.managementapp.entity;

import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;

public interface EmployeeDTO {
    String getFirstName();
    String getLastName();

    LocalDate getHireDate();

    default String getFullName() {
        return getFirstName().concat(" ").concat(getLastName());
    }

}
