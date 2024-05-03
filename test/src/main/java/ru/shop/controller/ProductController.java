package ru.shop.controller;

import org.springframework.web.bind.annotation.*;
import ru.shop.model.Product;
import ru.shop.service.CustomerService;
import ru.shop.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    ProductService productService;

    @GetMapping("/get")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable UUID id) {
        return productService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody Product product)
}
