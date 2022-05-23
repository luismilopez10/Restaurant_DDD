package com.restaurant_ddd.charge;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.charge.values.Description;
import com.restaurant_ddd.charge.values.OperationId;
import com.restaurant_ddd.order.values.Name;

import java.util.Objects;

public class Operation extends Entity<OperationId> {
    private Name name;
    private Description description;

    public Operation(OperationId entityId, Name name, Description description) {
        super(entityId);
        this.name = name;
        this.description = description;
    }

    // Getters
    public Name name() {
        return name;
    }

    public Description description() {
        return description;
    }

    // Behaviors
    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }

    public void updateDescription(Description description) {
        this.description = Objects.requireNonNull(description);
    }
}
