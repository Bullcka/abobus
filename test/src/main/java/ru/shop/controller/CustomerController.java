package ru.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shop.model.Customer;
import ru.shop.service.CustomerService;

import java.util.List;
@RestController
@RequestMapping("/customer")
public class CustomerController {
    CustomerService customerService;

    @GetMapping("/get")
    public List<Customer> getAllCustomer() {
        return customerService.findAll();
    }
}
