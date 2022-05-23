package com.restaurant_ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.Price;
import com.restaurant_ddd.order.values.ProductId;

public class ProductAdded extends DomainEvent {
    private final ProductId productId;
    private final Name name;
    private final Price price;

    public ProductAdded(ProductId entityId, Name name, Price price) {
        super("restaurant.order.productAdded");
        this.productId = entityId;
        this.name = name;
        this.price = price;
    }

    public ProductId getProductId() {
        return productId;
    }

    public Name getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }
}
