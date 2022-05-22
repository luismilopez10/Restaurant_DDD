package com.restaurant_ddd.order;

import co.com.sofka.domain.generic.AggregateEvent;
import com.restaurant_ddd.order.values.OrderId;

public class Order extends AggregateEvent<OrderId> {
    public Order(OrderId entityId) {
        super(entityId);
    }
}
