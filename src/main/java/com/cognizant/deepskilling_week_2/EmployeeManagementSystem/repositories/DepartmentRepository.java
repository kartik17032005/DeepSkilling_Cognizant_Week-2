package com.cognizant.deepskilling_week_2.EmployeeManagementSystem.repositories;

import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.entitites.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {
}
