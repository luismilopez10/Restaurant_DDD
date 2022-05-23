package com.restaurant_ddd.location.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.location.values.RestaurantId;
import com.restaurant_ddd.order.values.Name;

public class RestaurantAdded extends DomainEvent {
    private final RestaurantId restaurantId;
    private final Name name;

    public RestaurantAdded(RestaurantId entityId, Name name) {
        super("restaurant.location.restaurantAdded");
        this.restaurantId = entityId;
        this.name = name;
    }

    public RestaurantId getRestaurantId() {
        return restaurantId;
    }

    public Name getName() {
        return name;
    }
}
