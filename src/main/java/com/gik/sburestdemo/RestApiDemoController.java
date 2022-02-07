package com.gik.sburestdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coffees")
public class RestApiDemoController {

    private final CoffeeRepository coffeeRepository;

    public RestApiDemoController(CoffeeRepository coffeeRepository) {

        this.coffeeRepository = coffeeRepository;
        //выносим в отдельный класс
 /*       coffeeRepository.saveAll(List.of(
                new Coffee("Coffee Lorenzo"),
                new Coffee("Coffee Cereza"),
                new Coffee("Coffee Ganadar "),
                new Coffee("Coffee Tres Puntas")
        ));*/
    }

    @GetMapping
    public Iterable<Coffee> getCoffees() {
        return coffeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Coffee> getCoffeeById(@PathVariable String id) {
        return coffeeRepository.findById(id);
    }

    @PostMapping
    public Coffee postCoffee(@RequestBody Coffee coffee) {
        return coffeeRepository.save(coffee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee) {

        return (coffeeRepository.existsById(id))
                ? new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.OK)
                : new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        coffeeRepository.deleteById(id);
    }
}
