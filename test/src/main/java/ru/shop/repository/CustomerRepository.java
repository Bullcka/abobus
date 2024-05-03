package ru.shop.repository;

import ru.shop.model.Customer;
import ru.shop.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CustomerRepository implements IRepository<Customer> {

    List<Customer> customers = new ArrayList<>();

    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Optional<Customer> findById(UUID id) {
        for(var i: customers){
            if(i.getId().equals(id)){
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
