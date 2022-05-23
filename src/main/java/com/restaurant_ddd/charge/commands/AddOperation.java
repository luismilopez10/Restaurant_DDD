package com.restaurant_ddd.charge.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.charge.values.ChargeId;
import com.restaurant_ddd.charge.values.Description;
import com.restaurant_ddd.charge.values.OperationId;
import com.restaurant_ddd.order.values.Name;

public class AddOperation extends Command {

    private ChargeId chargeId;
    private OperationId operationId;
    private Name name;
    private Description description;

    public AddOperation(ChargeId chargeId, OperationId entityId, Name name, Description description) {
        this.chargeId = chargeId;
        operationId = entityId;
        this.name = name;
        this.description = description;
    }

    public ChargeId getChargeId() {
        return chargeId;
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
