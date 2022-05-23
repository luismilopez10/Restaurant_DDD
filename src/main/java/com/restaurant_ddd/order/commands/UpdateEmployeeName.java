package com.restaurant_ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.order.values.EmployeeId;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.OrderId;

public class UpdateEmployeeName extends Command {
    private final OrderId orderId;
    private final EmployeeId entityId;
    private final Name name;

    public UpdateEmployeeName(OrderId orderId, EmployeeId entityId, Name name) {
        this.orderId = orderId;
        this.entityId = entityId;
        this.name = name;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public EmployeeId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
