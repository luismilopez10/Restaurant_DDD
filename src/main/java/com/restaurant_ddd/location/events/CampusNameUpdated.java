package com.restaurant_ddd.location.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.location.values.CampusId;
import com.restaurant_ddd.order.values.Name;

public class CampusNameUpdated extends DomainEvent {
    private CampusId entityId;
    private Name name;

    public CampusNameUpdated(CampusId entityId, Name name) {
        super("restaurant.location.campusNameUpdated");
        this.entityId = entityId;
        this.name = name;
    }

    public CampusId getCampusId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
