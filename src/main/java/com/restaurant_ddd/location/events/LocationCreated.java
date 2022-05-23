package com.restaurant_ddd.location.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.TotalPrice;

public class LocationCreated extends DomainEvent {
    private final Name name;

    public LocationCreated(Name name) {
        super("restaurant.location.locationCreated");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
