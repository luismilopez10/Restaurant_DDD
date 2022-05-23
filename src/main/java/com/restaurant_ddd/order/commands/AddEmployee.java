package com.restaurant_ddd.order.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.order.values.Email;
import com.restaurant_ddd.order.values.EmployeeId;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.OrderId;

public class AddEmployee extends Command {
    private final OrderId orderId;
    private final EmployeeId entityId;
    private final Name name;
    private final Email email;

    public AddEmployee(OrderId orderId, EmployeeId entityId, Name name, Email email) {
        this.orderId = orderId;
        this.entityId = entityId;
        this.name = name;
        this.email = email;
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

    public Email getEmail() {
        return email;
    }
}
