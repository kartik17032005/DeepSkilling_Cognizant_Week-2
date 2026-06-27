package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.repositories;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
