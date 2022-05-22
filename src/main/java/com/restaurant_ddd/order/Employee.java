package com.restaurant_ddd.order;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.order.values.EmployeeId;

public class Employee extends Entity<EmployeeId> {
    public Employee(EmployeeId entityId) {
        super(entityId);
    }
}
