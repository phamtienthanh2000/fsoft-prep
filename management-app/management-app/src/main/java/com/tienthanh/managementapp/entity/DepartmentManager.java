package com.tienthanh.managementapp.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class DepartmentManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "emp_no")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "dept_no")
    private Department department;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
