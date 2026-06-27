package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_id")
    private int stockId;

    @Column(name = "st_code")
    private String stockCode;

    @Column(name = "st_date")
    private LocalDate stockDate;

    @Column(name = "st_open")
    private Double stockOpen;

    @Column(name = "st_close")
    private Double stockClose;

    @Column(name = "st_volume")
    private Double stockVolume;
}
