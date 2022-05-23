package com.restaurant_ddd.location.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.location.values.CampusId;
import com.restaurant_ddd.location.values.LocationId;
import com.restaurant_ddd.order.values.Name;

public class AddCampus extends Command {

    private LocationId locationId;
    private CampusId entityId;
    private Name name;

    public AddCampus(LocationId locationId, CampusId entityId, Name name) {
        this.locationId = locationId;
        this.entityId = entityId;
        this.name = name;
    }

    public LocationId getLocationId() {
        return locationId;
    }

    public CampusId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
