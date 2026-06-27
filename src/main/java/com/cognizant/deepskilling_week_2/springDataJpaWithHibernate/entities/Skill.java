package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "skill")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int skillId;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "skillList")
    @ToString.Exclude
    private Set<Employee> employeeList;
}