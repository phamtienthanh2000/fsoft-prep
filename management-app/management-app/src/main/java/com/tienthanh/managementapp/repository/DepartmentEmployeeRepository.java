package com.tienthanh.managementapp.repository;

import com.tienthanh.managementapp.entity.DepartmentEmployee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DepartmentEmployeeRepository {
    @PersistenceContext
    private final EntityManager entityManager;

    }
}
