package com.cognizant.deepskilling_week_2.EmployeeManagementSystem.services;

import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.entitites.DepartmentEntity;
import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.exceptions.DepartmentNotFoundException;
import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.exceptions.EmployeeNotFoundException;
import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    //get
    public List<DepartmentEntity> getAllDepartment() {
        return departmentRepository.findAll();
    }

    //get by id
    public Optional<DepartmentEntity> getDepartmentById(int id) {
        Optional<DepartmentEntity> department = departmentRepository.findById(id);

        if (!department.isPresent()) {
            throw new DepartmentNotFoundException();
        }

        return department;
    }

    //create
    public void createDepartment(DepartmentEntity department) {
        departmentRepository.save(department);
    }

    //update
    public DepartmentEntity updateDepartment(int id, DepartmentEntity department) {
        Optional<DepartmentEntity> DepartmentEntity = departmentRepository.findById(id);

        if (DepartmentEntity.isPresent()) {
            DepartmentEntity department1 = DepartmentEntity.get();

            department1.setName(department1.getName());
            return departmentRepository.save(department1);
        }

        throw new EmployeeNotFoundException();
    }

    //delete
    public void deleteDepartment(int id) {
        departmentRepository.deleteById(id);
    }
}
