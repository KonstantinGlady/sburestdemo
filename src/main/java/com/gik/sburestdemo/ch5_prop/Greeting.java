package com.gik.sburestdemo.ch5_prop;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix= "greeting")//добавить зависимость в pom spring-boot-configuration-processor для application.properties. Нужно повесить анотацию @ConfigurationPropertiesScan на main
public class Greeting {

    private String name;
    private String coffee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }
}
