package ru.shop.repository;

import ru.shop.model.Order;
import ru.shop.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class OrderRepository implements IRepository<Order> {

    List<Order> orders = new ArrayList<>();

    public void save(Order order) {
        orders.add(order);
    }

    public List<Order> findAll() {
        return orders;
    }

    @Override
    public Optional<Order> findById(UUID id) {
        for(var i: orders){
            if(i.getId().equals(id)){
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }

}
