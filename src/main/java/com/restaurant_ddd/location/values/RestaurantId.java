package com.restaurant_ddd.location.values;

import co.com.sofka.domain.generic.Identity;

public class RestaurantId extends Identity {

    public RestaurantId() {
    }

    private RestaurantId(String id) {
        super(id);
    }

    public static RestaurantId of(String id){
        return new RestaurantId(id);
    }
}
