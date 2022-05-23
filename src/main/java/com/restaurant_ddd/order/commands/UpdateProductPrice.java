package com.restaurant_ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.order.values.OrderId;
import com.restaurant_ddd.order.values.Price;
import com.restaurant_ddd.order.values.ProductId;

public class UpdateProductPrice extends Command {
    private final OrderId orderId;
    private final ProductId entityId;
    private final Price price;

    public UpdateProductPrice(OrderId orderId, ProductId entityId, Price price) {
        this.orderId = orderId;
        this.entityId = entityId;
        this.price = price;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public ProductId getEntityId() {
        return entityId;
    }

    public Price getName() {
        return price;
    }
}
