package com.restaurant_ddd.location.commands;

import co.com.sofka.domain.generic.Command;
import com.restaurant_ddd.location.values.Address;
import com.restaurant_ddd.location.values.CampusId;
import com.restaurant_ddd.location.values.LocationId;

public class UpdateCampusAddress extends Command {

    private LocationId locationId;
    private CampusId entityId;
    private Address address;

    public UpdateCampusAddress(LocationId locationId, CampusId entityId, Address address) {
        this.locationId = locationId;
        this.entityId = entityId;
        this.address = address;
    }

    public LocationId getLocationId() {
        return locationId;
    }

    public CampusId getEntityId() {
        return entityId;
    }

    public Address getAddress() {
        return address;
    }
}
