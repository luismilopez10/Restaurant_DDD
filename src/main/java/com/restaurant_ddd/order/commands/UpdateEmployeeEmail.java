package com.restaurant_ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.order.values.Email;
import com.restaurant_ddd.order.values.EmployeeId;
import com.restaurant_ddd.order.values.OrderId;

public class UpdateEmployeeEmail extends Command {
    private final OrderId orderId;
    private final EmployeeId entityId;
    private final Email email;

    public UpdateEmployeeEmail(OrderId orderId, EmployeeId entityId, Email email) {
        this.orderId = orderId;
        this.entityId = entityId;
        this.email = email;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public EmployeeId getEntityId() {
        return entityId;
    }

    public Email getEmail() {
        return email;
    }
}
