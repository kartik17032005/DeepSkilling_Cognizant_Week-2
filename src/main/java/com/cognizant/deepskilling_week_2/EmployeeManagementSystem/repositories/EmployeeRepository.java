package com.cognizant.deepskilling_week_2.EmployeeManagementSystem.repositories;

import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.entitites.DepartmentEntity;
import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.entitites.EmployeeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
    Page<EmployeeEntity> findAll(Pageable pageable);

    // Query Methods
    List<EmployeeEntity> findByName(String name);

    List<EmployeeEntity> findByEmail(String email);

    List<EmployeeEntity> findByDepartment(DepartmentEntity department);

    List<EmployeeEntity> findByNameContaining(String keyword);

    // JPQL Query
    @Query("SELECT e FROM EmployeeEntity e WHERE e.email = :email")
    List<EmployeeEntity> getEmployeeByEmail(@Param("email") String email);

    @Query("SELECT e FROM EmployeeEntity e WHERE e.department = :department")
    List<EmployeeEntity> getEmployeesByDepartment(@Param("department") DepartmentEntity department);

    @Query(name = "EmployeeEntity.findByName")
    List<EmployeeEntity> getEmployeeByName(@Param("name") String name);

    @Query(name = "EmployeeEntity.findByEmail")
    List<EmployeeEntity> getEmployeeByEmailNamed(@Param("email") String email);
}
