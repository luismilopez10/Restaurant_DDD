package com.restaurant_ddd.location.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.location.values.Address;
import com.restaurant_ddd.location.values.CampusId;
import com.restaurant_ddd.order.values.Name;

public class CampusAdded extends DomainEvent {
    private final CampusId campusId;
    private final Name name;
    private final Address address;

    public CampusAdded(CampusId entityId, Name name, Address address) {
        super("restaurant.location.campusAdded");
        this.campusId = entityId;
        this.name = name;
        this.address = address;
    }

    public CampusId getCampusId() {
        return campusId;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
