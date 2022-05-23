package com.restaurant_ddd.charge.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.charge.values.Description;
import com.restaurant_ddd.charge.values.OperationId;
import com.restaurant_ddd.order.values.Name;

public class OperationAdded extends DomainEvent {
    private OperationId operationId;
    private Name name;
    private Description description;

    public OperationAdded(OperationId entityId, Name name, Description description) {
        super("restaurant.charge.operationAdded");
        this.operationId = entityId;
        this.name = name;
        this.description = description;
    }

    public OperationId getOperationId() {
        return operationId;
    }

    public Name getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }
}
