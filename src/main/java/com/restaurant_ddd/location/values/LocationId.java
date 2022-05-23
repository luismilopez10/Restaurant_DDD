package com.restaurant_ddd.location.values;

import co.com.sofka.domain.generic.Identity;

public class LocationId extends Identity {

    public LocationId() {
    }

    private LocationId(String id) {
        super(id);
    }

    public static LocationId of(String id){
        return new LocationId(id);
    }
}
