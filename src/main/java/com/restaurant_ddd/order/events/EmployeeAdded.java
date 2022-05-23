package com.restaurant_ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.Email;
import com.restaurant_ddd.order.values.EmployeeId;
import com.restaurant_ddd.order.values.Name;

public class EmployeeAdded extends DomainEvent {
    private final EmployeeId employeeId;
    private final Name name;
    private final Email email;

    public EmployeeAdded(EmployeeId entityId, Name name, Email email) {
        super("restaurant.order.employeeAdded");
        this.employeeId = entityId;
        this.name = name;
        this.email = email;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }
}
