package com.cognizant.deepskilling_week_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeepSkillingWeek2Application {

    public static void main(String[] args) {

        SpringApplication.run(DeepSkillingWeek2Application.class, args);

//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        BookService constructorBean =
//                context.getBean("bookServiceConstructor", BookService.class);
//
//        constructorBean.displayService();
//
//        BookService setterBean =
//                context.getBean("bookServiceSetter", BookService.class);
//
//        setterBean.displayService();
    }
}
