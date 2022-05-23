package com.restaurant_ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.OrderId;
import com.restaurant_ddd.order.values.Price;
import com.restaurant_ddd.order.values.ProductId;

public class AddProduct extends Command {
    private final OrderId orderId;
    private final ProductId entityId;
    private final Name name;
    private final Price price;

    public AddProduct(OrderId orderId, ProductId entityId, Name name, Price price) {
        this.orderId = orderId;
        this.entityId = entityId;
        this.name = name;
        this.price = price;
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

    public Price getPrice() {
        return price;
    }
}
