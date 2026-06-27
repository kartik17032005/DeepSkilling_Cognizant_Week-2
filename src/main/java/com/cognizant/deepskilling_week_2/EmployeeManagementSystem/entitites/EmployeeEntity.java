package com.cognizant.deepskilling_week_2.EmployeeManagementSystem.entitites;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

@Entity
@Table(name = "employee_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQueries({
        @NamedQuery(
                name = "EmployeeEntity.findByName",
                query = "SELECT e FROM EmployeeEntity e WHERE e.name = :name"
        ),
        @NamedQuery(
                name = "EmployeeEntity.findByEmail",
                query = "SELECT e FROM EmployeeEntity e WHERE e.email = :email"
        )
})
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentEntity department;

    @CreatedDate
    private LocalDate createdDate;

    @CreatedBy
    private String whoCreated;

    @LastModifiedDate
    private String LastModifiedBy;

    @LastModifiedDate
    private LocalDate modifieDate;
}
