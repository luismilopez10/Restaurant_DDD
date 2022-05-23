package com.restaurant_ddd.charge.values;

import co.com.sofka.domain.generic.Identity;
import com.restaurant_ddd.location.values.CampusId;

public class OperationId extends Identity {

    public OperationId() {
    }

    private OperationId(String id) {
        super(id);
    }

    public static OperationId of(String id){
        return new OperationId(id);
    }
}
