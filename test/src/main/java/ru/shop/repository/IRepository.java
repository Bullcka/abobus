package ru.shop.repository;

import ru.shop.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IRepository<T> {
    void save(T entity);

    List<T> findAll();

    Optional<T> findById(UUID id);
}
