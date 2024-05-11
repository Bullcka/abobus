package ru.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "customer")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private UUID id;
    private String name;
    private String phone;
    private long age;
}
