package org.example.istad_co_application.controller;

import org.example.istad_co_application.dto.response.CoffeeResponse;
import org.example.istad_co_application.service.CoffeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/coffees")
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    // GET all
    @GetMapping
    public List<CoffeeResponse> getAllCoffees() {
        return coffeeService.getCoffee().stream()
                .map(c -> new CoffeeResponse(c.getName(), c.getPrice(), c.getDescription()))
                .toList();
    }

    // GET by ID → /api/v1/coffees/1
    @GetMapping("/{id}")
    public List<CoffeeResponse> getCoffeeById(@PathVariable Integer id) {
        return coffeeService.getCoffeeById(id).stream()
                .map(c -> new CoffeeResponse(c.getName(), c.getPrice(), c.getDescription()))
                .toList();
    }

    // GET by Name → /api/v1/coffees/search?name=Green tea
    @GetMapping("/search")
    public List<CoffeeResponse> searchCoffeeByName(@RequestParam String name) {
        return coffeeService.getCoffeeByName(name).stream()
                .map(c -> new CoffeeResponse(c.getName(), c.getPrice(), c.getDescription()))
                .toList();
    }

    // GET by Price → /api/v1/coffees/price?price=900.0
    @GetMapping("/price")
    public List<CoffeeResponse> getCoffeeByPrice(@RequestParam Double price) {
        return coffeeService.getCoffeeByPrice(price).stream()
                .map(c -> new CoffeeResponse(c.getName(), c.getPrice(), c.getDescription()))
                .toList();
    }
}