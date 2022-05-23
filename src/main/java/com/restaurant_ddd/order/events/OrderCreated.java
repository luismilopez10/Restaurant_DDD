package com.restaurant_ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.TotalPrice;

public class OrderCreated extends DomainEvent {
    private final TotalPrice totalPrice;

    public OrderCreated(TotalPrice totalPrice) {
        super("restaurant.order.orderCreated");
        this.totalPrice = totalPrice;
    }

    public TotalPrice getTotalPrice() {
        return totalPrice;
    }
}
