package com.tienthanh.managementapp.entity;

import com.tienthanh.managementapp.enums.Gender;
import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_no")
    private Integer employeeNo;
    @Column(name = "birth_date")
    private LocalDate dob;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @OneToMany(mappedBy = "employee",fetch = FetchType.LAZY)
    private List<DepartmentManager> departmentManagers;

    @OneToMany(mappedBy = "employee",fetch = FetchType.LAZY)
    private List<DepartmentEmployee> departmentEmployees;

    @OneToMany(mappedBy = "employee",fetch = FetchType.LAZY)
    private List<Title> titles;

    @OneToMany(mappedBy = "employee",fetch = FetchType.LAZY)
    private List<Salary> salaries;

    public Integer getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(Integer employeeNo) {
        this.employeeNo = employeeNo;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNo=" + employeeNo +
                ", dob=" + dob +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", hireDate=" + hireDate +
                '}';
    }
}
