package com.restaurant_ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.order.values.ClientId;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.OrderId;

public class UpdateClientName extends Command {
    private final OrderId orderId;
    private final ClientId entityId;
    private final Name name;

    public UpdateClientName(OrderId orderId, ClientId entityId, Name name) {
        this.orderId = orderId;
        this.entityId = entityId;
        this.name = name;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public ClientId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
