package com.restaurant_ddd.location;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.location.events.*;
import com.restaurant_ddd.location.values.Address;
import com.restaurant_ddd.location.values.CampusId;
import com.restaurant_ddd.location.values.LocationId;
import com.restaurant_ddd.location.values.RestaurantId;
import com.restaurant_ddd.order.values.Name;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Location extends AggregateEvent<LocationId> {

    protected Name name;
    protected Set<Restaurant> restaurants;
    protected Set<Campus> campus;

    public Location(LocationId entityId, Name name) {
        super(entityId);
        this.name = name;
        appendChange(new LocationCreated(name)).apply();
    }

    public Location(LocationId entityId) {
        super(entityId);
        subscribe(new LocationChange(this));
    }

    public static Location from(LocationId locationId, List<DomainEvent> events) {
        var location = new Location(locationId);
        events.forEach(location::applyEvent);
        return location;
    }

    // Getters
    public Name name() {
        return name;
    }

    public Set<Restaurant> restaurants() {
        return restaurants;
    }

    public Set<Campus> campus() {
        return campus;
    }

    // Restaurant Behaviors
    public void AddRestaurant(RestaurantId entityId, Name name) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        appendChange(new RestaurantAdded(entityId, name)).apply();
    }

    protected Optional<Restaurant> getRestaurantById(RestaurantId entityId) {
        return restaurants()
                .stream()
                .filter(restaurant -> restaurant.identity().equals(entityId))
                .findFirst();
    }

    public void UpdateRestaurantName(RestaurantId entityId, Name name) {
        appendChange(new RestaurantNameUpdated(entityId, name)).apply();
    }

    // Campus Behaviors
    public void AddCampus(CampusId entityId, Name name, Address address) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
        appendChange(new CampusAdded(entityId, name, address)).apply();
    }

    protected Optional<Campus> getCampusById(CampusId entityId) {
        return campus()
                .stream()
                .filter(campus -> campus.identity().equals(entityId))
                .findFirst();
    }

    public void UpdateCampusName(CampusId entityId, Name name) {
        appendChange(new CampusNameUpdated(entityId, name)).apply();
    }

    public void UpdateCampusAddress(CampusId entityId, Address address) {
        appendChange(new CampusAddressUpdated(entityId, address)).apply();
    }
}
