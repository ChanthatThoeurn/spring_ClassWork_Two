package org.example.istad_co_application.dto.response;

import org.example.istad_co_application.domain.Coffee;

import java.util.List;

public record CoffeeResponse(
    String name,
    Double price,
    String description
) {

}
