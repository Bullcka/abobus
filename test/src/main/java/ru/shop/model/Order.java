package ru.shop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private UUID id;
    private UUID customerId;
    private UUID productId;
    private long count;
    private long amount;
}
