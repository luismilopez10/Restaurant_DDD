package com.restaurant_ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.ClientId;
import com.restaurant_ddd.order.values.PhoneNumber;

public class ClientPhoneNumberUpdated extends DomainEvent {
    private ClientId clientId;
    private PhoneNumber phoneNumber;

    public ClientPhoneNumberUpdated(ClientId entityId, PhoneNumber phoneNumber) {
        super("restaurant.order.clientPhoneNumberUpdated");
        this.clientId = entityId;
        this.phoneNumber = phoneNumber;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
