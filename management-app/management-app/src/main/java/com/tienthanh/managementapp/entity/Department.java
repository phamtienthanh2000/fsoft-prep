package com.tienthanh.managementapp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationdjwqndjkwqType.IDENTITY)
    @Column(name="dept_no")
    private Integer departmentNo;
    @Column(name = "dept_name")
    private String departmentName;
 departmentEmployees;

    public Integer getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(Integer departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentNo='" + departmentNo + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
