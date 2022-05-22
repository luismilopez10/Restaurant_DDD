package com.restaurant_ddd.location;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.location.values.RestaurantId;

public class Restaurant extends Entity<RestaurantId> {
    public Restaurant(RestaurantId entityId) {
        super(entityId);
    }
}
