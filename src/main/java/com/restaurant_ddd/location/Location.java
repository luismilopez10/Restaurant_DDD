package com.restaurant_ddd.location;

import co.com.sofka.domain.generic.AggregateEvent;
import com.restaurant_ddd.location.values.LocationId;

public class Location extends AggregateEvent<LocationId> {
    public Location(LocationId entityId) {
        super(entityId);
    }
}
