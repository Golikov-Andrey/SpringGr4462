package org.example.config;

import org.example.domen.Car;
import org.example.domen.Engin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example.domen")
public class ProjectConfig {


//    @Bean
//    Engin engin1()
//    {
//        Engin eng = new Engin();
//        eng.setTypeEngin("Бензиновый");
//        return eng;
//    }
//
//
//    @Bean("BMW")
//    Car car1()
//    {
//        Car obCar = new Car(engin1());
//        obCar.setModel("X1");
//        obCar.setMade("BMW");
//        return obCar;
//    }

//    @Bean(name="Audi")
//    Car car2()
//    {
//        Car obCar = new Car();
//        obCar.setModel("S8");
//        obCar.setMade("Audi");
//        return obCar;
//    }
//
//    @Bean
//    @Primary
//    Car car3()
//    {
//        Car obCar = new Car();
//        obCar.setModel("H7");
//        obCar.setMade("HAVAL");
//        return obCar;
//    }
//
//    @Bean
//    String hello() {
//        return "Hello";
//    }
//
//    @Bean
//    Integer ten() {
//        return 10;
//    }

}
