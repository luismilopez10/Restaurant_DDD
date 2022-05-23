package com.restaurant_ddd.location.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.location.values.LocationId;
import com.restaurant_ddd.order.values.Name;

public class CreateLocation extends Command {

    private LocationId entityId;
    private Name name;

    public CreateLocation(LocationId entityId, Name name) {
        this.entityId = entityId;
        this.name = name;
    }

    public LocationId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
