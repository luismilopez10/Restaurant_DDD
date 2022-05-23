package com.restaurant_ddd.charge.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.charge.values.ChargeId;
import com.restaurant_ddd.charge.values.OperationId;
import com.restaurant_ddd.order.values.Name;

public class UpdateOperationName extends Command {

    private ChargeId chargeId;
    private OperationId entityId;
    private Name name;

    public UpdateOperationName(ChargeId chargeId, OperationId entityId, Name name) {
        this.chargeId = chargeId;
        this.entityId = entityId;
        this.name = name;
    }

    public ChargeId getChargeId() {
        return chargeId;
    }

    public OperationId getOperationId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
