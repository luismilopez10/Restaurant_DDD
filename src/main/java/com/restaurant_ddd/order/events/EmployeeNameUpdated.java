package com.restaurant_ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.EmployeeId;
import com.restaurant_ddd.order.values.Name;

public class EmployeeNameUpdated extends DomainEvent {
    private EmployeeId employeeId;
    private Name name;

    public EmployeeNameUpdated(EmployeeId entityId, Name name) {
        super("restaurant.order.employeeNameUpdated");
        this.employeeId = entityId;
        this.name = name;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public Name getName() {
        return name;
    }
}
