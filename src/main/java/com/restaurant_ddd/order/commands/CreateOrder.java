package com.restaurant_ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.order.values.OrderId;
import com.restaurant_ddd.order.values.TotalPrice;

public class CreateOrder extends Command {

    private final OrderId orderId;
    private final TotalPrice totalPrice;

    public CreateOrder(OrderId entityId, TotalPrice totalPrice) {
        this.orderId = entityId;
        this.totalPrice = totalPrice;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public TotalPrice getTotalPrice() {
        return totalPrice;
    }
}
