package com.restaurant_ddd.location;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.location.values.Address;
import com.restaurant_ddd.location.values.CampusId;
import com.restaurant_ddd.order.values.Name;

import java.util.Objects;

public class Campus extends Entity<CampusId> {
    private Name name;
    private Address address;

    public Campus(CampusId entityId, Name name, Address address) {
        super(entityId);
        this.name = name;
        this.address = address;
    }

    // Getters
    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    // Behaviors
    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateAddress(Address address){
        this.address = Objects.requireNonNull(address);
    }
}
