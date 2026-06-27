package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.repositories;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
