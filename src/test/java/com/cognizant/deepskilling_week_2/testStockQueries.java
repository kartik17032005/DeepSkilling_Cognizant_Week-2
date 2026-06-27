package com.cognizant.deepskilling_week_2;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.repositories.StockRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class testStockQueries {
    @Autowired
    private StockRepository stockRepository;

    @Test
    public void testStockQueries() {

        System.out.println("Facebook September 2019");
        stockRepository.findByStockCodeAndStockDateBetween(
                        "FB",
                        LocalDate.of(2019, 9, 1),
                        LocalDate.of(2019, 9, 30))
                .forEach(System.out::println);

        System.out.println("Google Close > 1250");
        stockRepository.findByStockCodeAndStockCloseGreaterThan(
                        "GOOGL", 1250.0)
                .forEach(System.out::println);

        System.out.println("Top 3 Volume");
        stockRepository.findTop3ByOrderByStockVolumeDesc()
                .forEach(System.out::println);

        System.out.println("Lowest 3 Netflix");
        stockRepository.findTop3ByStockCodeOrderByStockCloseAsc("NFLX")
                .forEach(System.out::println);
    }
}
