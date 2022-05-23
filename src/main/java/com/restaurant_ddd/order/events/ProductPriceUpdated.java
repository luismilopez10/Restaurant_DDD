package com.restaurant_ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.Price;
import com.restaurant_ddd.order.values.ProductId;

public class ProductPriceUpdated extends DomainEvent {
    private ProductId productId;
    private Price price;

    public ProductPriceUpdated(ProductId entityId, Price price) {
        super("restaurant.order.productPriceUpdated");
        this.productId = entityId;
        this.price = price;
    }

    public ProductId getProductId() {
        return productId;
    }

    public Price getPrice() {
        return price;
    }
}
