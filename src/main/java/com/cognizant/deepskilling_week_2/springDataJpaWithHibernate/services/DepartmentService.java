package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.services;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Department;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Employee;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.repositories.DepartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Transactional
    public Optional<Department> getDepartmentById(int id){
        return departmentRepository.findById(id);
    }

    @Transactional
    public void getDepartmentById(Department department){
        departmentRepository.save(department);
    }

}
