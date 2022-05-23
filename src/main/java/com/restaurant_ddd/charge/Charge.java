package com.restaurant_ddd.charge;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.charge.events.ChargeCreated;
import com.restaurant_ddd.charge.events.OperationAdded;
import com.restaurant_ddd.charge.events.OperationDescriptionUpdated;
import com.restaurant_ddd.charge.events.OperationNameUpdated;
import com.restaurant_ddd.charge.values.ChargeId;
import com.restaurant_ddd.charge.values.Description;
import com.restaurant_ddd.charge.values.OperationId;
import com.restaurant_ddd.order.values.Name;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Charge extends AggregateEvent<ChargeId> {
    protected Name name;
    protected Set<Operation> operations;

    public Charge(ChargeId entityId, Name name) {
        super(entityId);
        appendChange(new ChargeCreated(name)).apply();
    }

    public Charge(ChargeId entityId) {
        super(entityId);
        subscribe(new ChargeChange(this));
    }

    public static Charge from(ChargeId chargeId, List<DomainEvent> events) {
        var charge = new Charge(chargeId);
        events.forEach(charge::applyEvent);
        return charge;
    }

    // Getters
    public Name name() {
        return name;
    }

    public Set<Operation> operations() {
        return operations;
    }

    // Operation Behaviors
    public void AddOperation(OperationId entityId, Name name, Description description) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(description);
        appendChange(new OperationAdded(entityId, name, description)).apply();
    }

    protected Optional<Operation> getOperationById(OperationId entityId) {
        return operations()
                .stream()
                .filter(operation -> operation.identity().equals(entityId))
                .findFirst();
    }

    public void UpdateOperationName(OperationId entityId, Name name) {
        appendChange(new OperationNameUpdated(entityId, name)).apply();
    }

    public void UpdateOperationDescription(OperationId entityId, Description description) {
        appendChange(new OperationDescriptionUpdated(entityId, description)).apply();
    }
}
