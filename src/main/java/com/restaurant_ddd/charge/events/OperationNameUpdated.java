package com.restaurant_ddd.charge.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.charge.values.OperationId;
import com.restaurant_ddd.order.values.Name;

public class OperationNameUpdated extends DomainEvent {
    private OperationId operationId;
    private Name name;

    public OperationNameUpdated(OperationId entityId, Name name) {
        super("restaurant.charge.operationNameUpdated");
        this.operationId = entityId;
        this.name = name;
    }

    public OperationId getOperationId() {
        return operationId;
    }

    public Name getName() {
        return name;
    }
}
