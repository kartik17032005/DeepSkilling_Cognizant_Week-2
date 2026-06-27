package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "country")
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Country {

    @Id
    @Column(name = "co_code")
    private String coCode;

    @Column(name = "co_name")
    private String coName;
}
