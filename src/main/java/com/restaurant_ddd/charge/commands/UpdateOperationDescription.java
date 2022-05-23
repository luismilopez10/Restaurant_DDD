package com.restaurant_ddd.charge.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.charge.values.ChargeId;
import com.restaurant_ddd.charge.values.Description;
import com.restaurant_ddd.charge.values.OperationId;

public class UpdateOperationDescription extends Command {

    private ChargeId chargeId;
    private OperationId entityId;
    private Description description;

    public UpdateOperationDescription(ChargeId chargeId, OperationId entityId, Description description) {
        this.chargeId = chargeId;
        this.entityId = entityId;
        this.description = description;
    }

    public ChargeId getChargeId() {
        return chargeId;
    }

    public OperationId getEntityId() {
        return entityId;
    }

    public Description getDescription() {
        return description;
    }
}
