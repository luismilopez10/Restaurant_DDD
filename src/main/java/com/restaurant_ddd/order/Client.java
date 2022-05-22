package com.restaurant_ddd.order;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.order.values.ClientId;

public class Client extends Entity<ClientId> {
    public Client(ClientId entityId) {
        super(entityId);
    }
}
