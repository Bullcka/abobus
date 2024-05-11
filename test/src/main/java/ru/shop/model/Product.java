package ru.shop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "product")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private UUID id;
    private String name;
    private long cost;
    @Enumerated(EnumType.STRING)
    private ProductType productType;
}
