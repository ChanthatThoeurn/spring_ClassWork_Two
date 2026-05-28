package org.example.istad_co_application.dto.request;

public record CoffeeRequest(
        Integer id,
        String name,
        Double price,
        String description

) {
}
