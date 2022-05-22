package com.restaurant_ddd.charge;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.charge.values.OperationId;

public class Operation extends Entity<OperationId> {
    public Operation(OperationId entityId) {
        super(entityId);
    }
}
