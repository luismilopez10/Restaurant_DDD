package com.restaurant_ddd.charge.values;

import co.com.sofka.domain.generic.Identity;
import com.restaurant_ddd.location.values.CampusId;

public class ChargeId extends Identity {

    public ChargeId() {
    }

    private ChargeId(String id) {
        super(id);
    }

    public static ChargeId of(String id){
        return new ChargeId(id);
    }
}
