package com.restaurant_ddd.location;

import co.com.sofka.domain.generic.EventChange;
import com.restaurant_ddd.location.events.*;

import java.util.HashSet;

public class LocationChange extends EventChange {
    public LocationChange(Location location) {

        apply((LocationCreated event) -> {
            location.name = event.getName();
            location.restaurants = new HashSet<>();
            location.campus = new HashSet<>();
        });


        // Restaurant events
        apply((RestaurantAdded event) -> {
            location.restaurants.add(new Restaurant(
                    event.getRestaurantId(),
                    event.getName()
            ));
        });

        apply((RestaurantNameUpdated event) -> {
            var restaurant = location.getRestaurantById(event.getRestaurantId())
                    .orElseThrow(() -> new IllegalArgumentException("Restaurant not found in the current location"));

            restaurant.updateName(event.getName());
        });


        // Campus events
        apply((CampusAdded event) -> {
            location.campus.add(new Campus(
                    event.getCampusId(),
                    event.getName(),
                    event.getAddress()
            ));
        });

        apply((CampusNameUpdated event) -> {
            var campus = location.getCampusById(event.getCampusId())
                    .orElseThrow(() -> new IllegalArgumentException("Campus not found in the current location"));

            campus.updateName(event.getName());
        });

        apply((CampusAddressUpdated event) -> {
            var campus = location.getCampusById(event.getCampusId())
                    .orElseThrow(() -> new IllegalArgumentException("Campus not found in the current location"));

            campus.updateAddress(event.getAddress());
        });
    }
}
