package com.restaurant_ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.order.values.ClientId;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.OrderId;
import com.restaurant_ddd.order.values.PhoneNumber;

public class AddClient extends Command {
    private final OrderId orderId;
    private final ClientId entityId;
    private final Name name;
    private final PhoneNumber phoneNumber;

    public AddClient(OrderId orderId, ClientId entityId, Name name, PhoneNumber phoneNumber) {
        this.orderId = orderId;
        this.entityId = entityId;
        this.name = name;
        this.phoneNumber = phoneNumber;
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

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
