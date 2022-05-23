package com.restaurant_ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.ProductId;

public class ProductNameUpdated extends DomainEvent {
    private ProductId productId;
    private Name name;

    public ProductNameUpdated(ProductId entityId, Name name) {
        super("restaurant.order.productNameUpdated");
        this.productId = entityId;
        this.name = name;
    }

    public ProductId getProductId() {
        return productId;
    }

    public Name getName() {
        return name;
    }
}
