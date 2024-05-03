package ru.shop.repository;

import ru.shop.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProductRepository implements IRepository<Product> {

    List<Product> products = new ArrayList<>();

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> findAll() {
        return products;
    }

    public Optional<Product> findById(UUID id){
        for(var i: products){
            if(i.getId().equals(id)){
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
