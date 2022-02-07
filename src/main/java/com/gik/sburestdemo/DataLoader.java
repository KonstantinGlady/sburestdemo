package com.gik.sburestdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DataLoader {

    private final CoffeeRepository coffeeRepository;

    public DataLoader(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @PostConstruct
    public void loadData() {
        coffeeRepository.saveAll(List.of(
                new Coffee("Coffee Lorenzo"),
                new Coffee("Coffee Cereza"),
                new Coffee("Coffee Ganadar "),
                new Coffee("Coffee Tres Puntas")
        ));
    }
}
