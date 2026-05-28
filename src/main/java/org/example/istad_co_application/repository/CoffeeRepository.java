package org.example.istad_co_application.repository;

import org.example.istad_co_application.domain.Coffee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CoffeeRepository {
    public List<Coffee> beanCoffees() {
        Coffee coffee = new Coffee(1,"Ice late",900.0,"sugar 10%");
        Coffee coffee1 = new Coffee(2,"Hot late",99.0,"sugar 20%");
        Coffee coffee2 = new Coffee(3,"Green tea",890.0,"sugar 30%");
        return Arrays.asList(coffee, coffee1, coffee2);
    }
    public Coffee getCoffeeById(Integer id) {
        return beanCoffees().stream().filter(coffee -> coffee.getId().equals(id)).findFirst().get();
    }
    public List<Coffee> getCoffeeByName(String name) {
        return Collections.singletonList(beanCoffees().stream().filter(coffee -> coffee.getName().equalsIgnoreCase(name)).findFirst().orElse(null));
    }
    public List<Coffee> getCoffeeByPrice(Double price) {
        return beanCoffees().stream().filter(coffee -> coffee.getPrice().equals(price)).collect(Collectors.toList());
    }
}
