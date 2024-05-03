package ru.shop.service;

import lombok.RequiredArgsConstructor;
import ru.shop.model.Product;
import ru.shop.model.ProductType;
import ru.shop.repository.IRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class ProductService {

    private final IRepository<Product> repository;

    public void save(Product product) {
        repository.save(product);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public List<Product> findByProductType(ProductType productType) {
        List<Product> result = new ArrayList<>();
        for (Product product : repository.findAll()) {
            if (product.getProductType() == productType) {
                result.add(product);
            }
        }
        return result;
    }

    public Optional<Product> getById (UUID id){
        return repository.findById(id);
    }

}
