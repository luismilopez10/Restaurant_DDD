package com.restaurant_ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.ClientId;
import com.restaurant_ddd.order.values.Name;
import com.restaurant_ddd.order.values.PhoneNumber;

public class ClientAdded extends DomainEvent {
    private final ClientId clientId;
    private final Name name;
    private final PhoneNumber phoneNumber;

    public ClientAdded(ClientId entityId, Name name, PhoneNumber phoneNumber) {
        super("restaurant.order.clientAdded");
        this.clientId = entityId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public Name getName() {
        return name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
