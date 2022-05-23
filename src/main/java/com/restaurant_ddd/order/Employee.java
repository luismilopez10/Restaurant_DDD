package com.restaurant_ddd.order;

import co.com.sofka.domain.generic.Entity;
import com.restaurant_ddd.order.values.Email;
import com.restaurant_ddd.order.values.EmployeeId;
import com.restaurant_ddd.order.values.Name;

import java.util.Objects;

public class Employee extends Entity<EmployeeId> {

    private Name name;
    private Email email;

    public Employee(EmployeeId entityId, Name name, Email email) {
        super(entityId);
        this.name = name;
        this.email = email;
    }

    // Getters
    public Name name() {
        return name;
    }

    public Email email() {
        return email;
    }

    // Behaviors
    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }
}
