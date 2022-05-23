package com.restaurant_ddd.charge.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.charge.values.Description;
import com.restaurant_ddd.charge.values.OperationId;

public class OperationDescriptionUpdated extends DomainEvent {
    private OperationId operationId;
    private Description description;

    public OperationDescriptionUpdated(OperationId entityId, Description description) {
        super("restaurant.charge.operationDescriptionUpdated");
        operationId = entityId;
        this.description = description;
    }

    public OperationId getOperationId() {
        return operationId;
    }

    public Description getDescription() {
        return description;
    }
}
