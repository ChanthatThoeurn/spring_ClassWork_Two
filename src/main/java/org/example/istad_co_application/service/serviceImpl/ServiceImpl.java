package org.example.istad_co_application.service.serviceImpl;
import org.example.istad_co_application.domain.Coffee;
import org.example.istad_co_application.repository.CoffeeRepository;
import org.example.istad_co_application.service.CoffeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImpl implements CoffeeService {
private final CoffeeRepository coffeeRepository;

public ServiceImpl(CoffeeRepository coffeeRepository) {
    this.coffeeRepository = coffeeRepository;
}

    @Override
    public List<Coffee> getCoffee() {

        return coffeeRepository.beanCoffees().stream()
                .filter(coffee -> coffee.getId()>1)
                .toList();
    }
}
