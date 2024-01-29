package org.example;

import org.example.config.ProjectConfig;
import org.example.domain.Car;
import org.example.domain.GasolinEngin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Car p = context.getBean(Car.class);
        p.go();
    }
}