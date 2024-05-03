package ru.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shop.model.Customer;
import ru.shop.model.Order;
import ru.shop.service.CustomerService;
import ru.shop.service.OrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {
    OrderService orderService;
    CustomerService customerService;

    @GetMapping("/get")
    public List<Order> getAllOrder() {
        return orderService.findAll();
    }

    @GetMapping("/customer/{customerId}")
    public List<Order> getByCustomerId(@PathVariable UUID customerId) {
        return orderService.findByCustomer(customerService.getById(customerId));
    }

    @GetMapping("/customer/{customerId}/total")
    public long getCustomerTotal(UUID customerId) {
        return orderService.getTotalCustomerAmount(customerService.getById(customerId));
    }
}

