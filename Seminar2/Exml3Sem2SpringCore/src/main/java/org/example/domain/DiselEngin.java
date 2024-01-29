package org.example.domain;

import org.example.interfaces.iEngin;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Lazy
public class DiselEngin implements iEngin {
    public DiselEngin() {
        System.out.println("Создан экземпляр DiselEngin");
    }

    // @Override
    public void startEngine() {
        System.out.println("Запущен Дизел 65р.л");
    }
}
