package com.restaurant_ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.Email;
import com.restaurant_ddd.order.values.EmployeeId;

public class EmployeeEmailUpdated extends DomainEvent {
    private EmployeeId employeeId;
    private Email email;

    public EmployeeEmailUpdated(EmployeeId entityId, Email email) {
        super("restaurant.order.employeeEmailUpdated");
        this.employeeId = entityId;
        this.email = email;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public Email getEmail() {
        return email;
    }
}
