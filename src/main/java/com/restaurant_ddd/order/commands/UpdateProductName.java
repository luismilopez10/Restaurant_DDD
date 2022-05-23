package com.restaurant_ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.OrderId;
import com.restaurant_ddd.order.values.ProductId;

public class UpdateProductName extends Command {
    private final OrderId orderId;
    private final ProductId entityId;
    private final Name name;

    public UpdateProductName(OrderId orderId, ProductId entityId, Name name) {
        this.orderId = orderId;
        this.entityId = entityId;
        this.name = name;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public ProductId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
