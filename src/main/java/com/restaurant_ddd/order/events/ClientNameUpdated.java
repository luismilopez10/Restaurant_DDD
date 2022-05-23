package com.restaurant_ddd.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.values.ClientId;
import com.restaurant_ddd.order.values.Name;

public class ClientNameUpdated extends DomainEvent {
    private ClientId clientId;
    private Name name;

    public ClientNameUpdated(ClientId entityId, Name name) {
        super("restaurant.order.clientNameUpdated");
        this.clientId = entityId;
        this.name = name;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public Name getName() {
        return name;
    }
}
