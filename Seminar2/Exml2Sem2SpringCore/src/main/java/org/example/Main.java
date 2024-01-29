package org.example;

import org.example.config.ProjectConfig;
import org.example.domen.Car;
import org.example.domen.Engin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        Engin eng = context.getBean(Engin.class);

        Car simpleCar = context.getBean(Car.class);

        System.out.println(simpleCar);
        System.out.println(eng);
    }
}