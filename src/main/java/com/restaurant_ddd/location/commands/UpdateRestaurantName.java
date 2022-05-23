package com.restaurant_ddd.location.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.location.values.LocationId;
import com.restaurant_ddd.location.values.RestaurantId;
import com.restaurant_ddd.order.values.Name;

public class UpdateRestaurantName extends Command {

    private LocationId locationId;
    private RestaurantId entityId;
    private Name name;

    public UpdateRestaurantName(LocationId locationId, RestaurantId entityId, Name name) {
        this.locationId = locationId;
        this.entityId = entityId;
        this.name = name;
    }

    public LocationId getLocationId() {
        return locationId;
    }

    public RestaurantId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
