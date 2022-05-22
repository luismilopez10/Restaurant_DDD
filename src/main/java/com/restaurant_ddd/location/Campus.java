package com.restaurant_ddd.location;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.location.values.CampusId;

public class Campus extends Entity<CampusId> {
    public Campus(CampusId entityId) {
        super(entityId);
    }
}
