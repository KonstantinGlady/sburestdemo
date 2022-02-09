package com.gik.sburestdemo.ch5_prop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//второй вариант с properties котролируются через класс(более защищенный).
//добавляем класс с greeting. и зависимость spring-boot-configuration-processor
//этот вариант не имеет дефолтных @Value как первый
@RestController
@RequestMapping("/greeting-new")
public class GreetingControllerNew {

    private Greeting greeting;//нужно заинжектить класс с настройками

    public GreetingControllerNew(Greeting greeting) {
        this.greeting = greeting;
    }

    @GetMapping
    public String getGreeting() {
        return greeting.getName();
    }

    @GetMapping("/coffee")
    public String getNameAndCoffee() {
        return greeting.getCoffee();
    }
}
