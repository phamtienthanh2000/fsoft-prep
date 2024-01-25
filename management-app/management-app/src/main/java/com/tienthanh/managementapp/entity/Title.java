package com.tienthanh.managementapp.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "titles")
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;
    @Column(name = "from_date")
    LocalDate fromDate;
    @Column(name = "to_date")
    LocalDate toDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_no")
    Employee employee;
}
