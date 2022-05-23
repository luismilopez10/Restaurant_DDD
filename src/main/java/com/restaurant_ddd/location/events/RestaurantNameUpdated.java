package com.restaurant_ddd.location.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.location.values.RestaurantId;
import com.restaurant_ddd.order.values.Name;

public class RestaurantNameUpdated extends DomainEvent {
    private RestaurantId restaurantId;
    private Name name;

    public RestaurantNameUpdated(RestaurantId entityId, Name name) {
        super("restaurant.location.restaurantNameUpdated");
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
