package com.restaurant_ddd.charge.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.Name;

public class ChargeCreated extends DomainEvent {
    private Name name;

    public ChargeCreated(Name name) {
        super("restaurant.charge.chargeCreated");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
