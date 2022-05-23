package com.restaurant_ddd.order;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.Price;
import com.restaurant_ddd.order.values.ProductId;

import java.util.Objects;

public class Product extends Entity<ProductId> {

    private Name name;
    private Price price;

    public Product(ProductId entityId, Name name, Price price) {
        super(entityId);
        this.name = name;
        this.price = price;
    }
    // Getters
    public Name name() {
        return name;
    }

    public Price price() {
        return price;
    }

    // Behaviors
    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updatePrice(Price price){
        this.price = Objects.requireNonNull(price);
    }
}
