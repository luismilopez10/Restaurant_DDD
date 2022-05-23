package com.restaurant_ddd.location;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.location.values.RestaurantId;
import com.restaurant_ddd.order.values.Name;

import java.util.Objects;

public class Restaurant extends Entity<RestaurantId> {
    private Name name;

    public Restaurant(RestaurantId entityId, Name name) {
        super(entityId);
        this.name = name;
    }

    // Getters
    public Name getName() {
        return name;
    }

    // Behaviors
    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }
}
