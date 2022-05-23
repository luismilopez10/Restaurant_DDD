package com.restaurant_ddd.location.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.location.values.Address;
import com.restaurant_ddd.location.values.CampusId;

public class CampusAddressUpdated extends DomainEvent {
    private CampusId entityId;
    private Address address;

    public CampusAddressUpdated(CampusId entityId, Address address) {
        super("restaurant.location.campusNameUpdated");
        this.entityId = entityId;
        this.address = address;
    }

    public CampusId getCampusId() {
        return entityId;
    }

    public Address getAddress() {
        return address;
    }
}
