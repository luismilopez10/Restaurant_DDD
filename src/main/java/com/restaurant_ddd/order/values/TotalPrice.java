package com.restaurant_ddd.order.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalPrice implements ValueObject<Double> {
    private final Double value;

    public TotalPrice(Double value) {
        this.value = Objects.requireNonNull(value);
        if (this.value < 0){
            throw new IllegalArgumentException("Invalid negative price");
        }

        var regexPattern = "(?=.*?\\d)^\\$?(([1-9]\\d{0,2}(,\\d{3})*)|\\d+)?(\\.\\d{1,2})?$";
        if (!String.valueOf(value).matches(regexPattern)){
            throw new IllegalArgumentException("Invalid money format");
        }
    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalPrice that = (TotalPrice) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
