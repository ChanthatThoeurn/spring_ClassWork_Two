package org.example.istad_co_application.repository;

import org.example.istad_co_application.domain.Coffee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CoffeeRepository {
    public List<Coffee> beanCoffees() {
        Coffee coffee = new Coffee(1,"Ice late","sugar 10%");
        Coffee coffee1 = new Coffee(2,"Hot late","sugar 20%");
        Coffee coffee2 = new Coffee(3,"Green tea","sugar 30%");
        return Arrays.asList(coffee, coffee1, coffee2);
    }
}
