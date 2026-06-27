package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.repositories;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByStockCodeAndStockDateBetween(
            String code,
            LocalDate start,
            LocalDate end);

    List<Stock> findByStockCodeAndStockCloseGreaterThan(
            String code,
            Double price);

    List<Stock> findTop3ByOrderByStockVolumeDesc();

    List<Stock> findTop3ByStockCodeOrderByStockCloseAsc(
            String code);
}
