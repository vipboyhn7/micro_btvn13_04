package com.example.gatewayservice;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/api/products")
    public Map<String, Object> products() {
        return Map.of(
                "service", "product-service-mock",
                "products", List.of(
                        Map.of("id", 1, "name", "Laptop"),
                        Map.of("id", 2, "name", "Keyboard")));
    }
}
