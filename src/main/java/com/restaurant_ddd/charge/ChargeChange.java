package com.restaurant_ddd.charge;

import co.com.sofka.domain.generic.EventChange;
import com.restaurant_ddd.charge.events.ChargeCreated;
import com.restaurant_ddd.charge.events.OperationAdded;
import com.restaurant_ddd.charge.events.OperationDescriptionUpdated;
import com.restaurant_ddd.charge.events.OperationNameUpdated;

import java.util.HashSet;

public class ChargeChange extends EventChange {
    public ChargeChange(Charge charge) {

        apply((ChargeCreated event) -> {
            charge.name = event.getName();
            charge.operations = new HashSet<>();
        });


        // Operation events
        apply((OperationAdded event) -> {
            var numOperations = charge.operations.size();

            if (numOperations < 1) {
                throw new IllegalArgumentException("The charge must have more then one operation");
            }

            charge.operations.add(new Operation(
                    event.getOperationId(),
                    event.getName(),
                    event.getDescription()
            ));
        });

        apply((OperationNameUpdated event) -> {
            var operation = charge.getOperationById(event.getOperationId())
                    .orElseThrow(() -> new IllegalArgumentException("Operation not found in the current charge"));

            operation.updateName(event.getName());
        });

        apply((OperationDescriptionUpdated event) -> {
            var operation = charge.getOperationById(event.getOperationId())
                    .orElseThrow(() -> new IllegalArgumentException("Operation not found in the current charge"));

            operation.updateDescription(event.getDescription());
        });
    }
}
