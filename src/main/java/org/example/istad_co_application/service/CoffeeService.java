package org.example.istad_co_application.service;

import org.example.istad_co_application.domain.Coffee;
import org.example.istad_co_application.repository.CoffeeRepository;

import java.util.List;

public interface CoffeeService {
     List<Coffee> getCoffee();
}
