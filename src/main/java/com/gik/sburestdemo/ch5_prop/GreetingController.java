package com.gik.sburestdemo.ch5_prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Value("${greeting-name: Mirage}")//значение по умолчанию если не найдется в application.properties
    private String name;

    @Value("${greeting-coffee: ${greeting-name} is drinking coffee Ganador}")//если закоментить в application.pro оба значения будет ошибка
    private String coffee;

    @GetMapping
    public String getGreeting() {
        return name;
    }

    @GetMapping("/coffee")
    public String getCoffeeAndName() {
        return coffee;
    }
}
