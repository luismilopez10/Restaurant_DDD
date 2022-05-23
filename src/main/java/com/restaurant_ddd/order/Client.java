package com.restaurant_ddd.order;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.order.values.ClientId;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.PhoneNumber;

import java.util.Objects;

public class Client extends Entity<ClientId> {
    private Name name;
    private PhoneNumber phoneNumber;

    public Client(ClientId entityId, Name name, PhoneNumber phoneNumber) {
        super(entityId);
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public Name name() {
        return name;
    }

    public PhoneNumber phoneNumber() {
        return phoneNumber;
    }

    // Behaviors
    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updatePhoneNumber(PhoneNumber phoneNumber){
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
    }
}
