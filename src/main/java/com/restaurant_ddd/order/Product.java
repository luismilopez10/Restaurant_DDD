package com.restaurant_ddd.order;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.order.values.ProductId;

public class Product extends Entity<ProductId> {
    public Product(ProductId entityId) {
        super(entityId);
    }
}
