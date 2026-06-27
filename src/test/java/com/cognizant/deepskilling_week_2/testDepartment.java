package com.cognizant.deepskilling_week_2;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Department;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Employee;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Skill;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.services.DepartmentService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@Slf4j
@SpringBootTest
public class testDepartment {

    private DepartmentService departmentService;

    @Test
    public void testGetDepartment(){

        Optional<Department> department =
                departmentService.getDepartmentById(1);

        log.info("Department : {}", department);

    }


}
