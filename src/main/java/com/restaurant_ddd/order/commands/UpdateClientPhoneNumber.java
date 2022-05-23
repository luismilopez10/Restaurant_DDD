package com.restaurant_ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.order.values.ClientId;
import com.restaurant_ddd.order.values.OrderId;
import com.restaurant_ddd.order.values.PhoneNumber;

public class UpdateClientPhoneNumber extends Command {
    private final OrderId orderId;
    private final ClientId entityId;
    private final PhoneNumber phoneNumber;

    public UpdateClientPhoneNumber(OrderId orderId, ClientId entityId, PhoneNumber phoneNumber) {
        this.orderId = orderId;
        this.entityId = entityId;
        this.phoneNumber = phoneNumber;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public ClientId getEntityId() {
        return entityId;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
