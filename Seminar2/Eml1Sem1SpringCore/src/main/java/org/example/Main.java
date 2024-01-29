package org.example;

import org.example.config.ProjectConfiguration;
import org.example.domain.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        Car bmw = new Car();
//        bmw.setModel("X1");
//        bmw.setMade("BMW");

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Car simpleCar = context.getBean("Audi",Car.class);
        System.out.println(simpleCar.getModel()+" "+simpleCar.getMade());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer num = context.getBean(Integer.class);
        System.out.println(num);
    }
}