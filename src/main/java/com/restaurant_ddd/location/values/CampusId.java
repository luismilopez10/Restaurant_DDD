package com.restaurant_ddd.location.values;

import co.com.sofka.domain.generic.Identity;

public class CampusId extends Identity {

    public CampusId() {
    }

    private CampusId(String id) {
        super(id);
    }

    public static CampusId of(String id){
        return new CampusId(id);
    }
}
