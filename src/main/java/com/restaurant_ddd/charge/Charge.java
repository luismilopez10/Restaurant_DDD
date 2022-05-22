package com.restaurant_ddd.charge;

import co.com.sofka.domain.generic.AggregateEvent;
import com.restaurant_ddd.charge.values.ChargeId;

public class Charge extends AggregateEvent<ChargeId> {
    public Charge(ChargeId entityId) {
        super(entityId);
    }
}
