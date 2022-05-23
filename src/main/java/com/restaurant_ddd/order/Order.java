package com.restaurant_ddd.order;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.restaurant_ddd.order.events.*;
import com.restaurant_ddd.order.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Order extends AggregateEvent<OrderId> {
    protected TotalPrice totalPrice;
    protected Set<Client> clients;
    protected Set<Employee> employees;
    protected Set<Product> products;

    public Order(OrderId entityId, TotalPrice totalPrice) {
        super(entityId);
        this.totalPrice = totalPrice;
        appendChange(new OrderCreated(totalPrice)).apply();
    }

    public Order(OrderId entityId) {
        super(entityId);
        subscribe(new OrderChange(this));
    }

    public static Order from(OrderId orderId, List<DomainEvent> events) {
        var order = new Order(orderId);
        events.forEach(order::applyEvent);
        return order;
    }

    // Getters
    public TotalPrice totalPrice() {
        return totalPrice;
    }

    public Set<Client> clients() {
        return clients;
    }

    public Set<Employee> employees() {
        return employees;
    }

    public Set<Product> products() {
        return products;
    }

    // Client Behaviors
    public void AddClient(ClientId entityId, Name name, PhoneNumber phoneNumber) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(phoneNumber);
        appendChange(new ClientAdded(entityId, name, phoneNumber)).apply();
    }

    protected Optional<Client> getClientById(ClientId entityId) {
        return clients()
                .stream()
                .filter(client -> client.identity().equals(entityId))
                .findFirst();
    }

    public void UpdateClientName(ClientId entityId, Name name) {
        appendChange(new ClientNameUpdated(entityId, name)).apply();
    }

    public void UpdateClientPhoneNumber(ClientId entityId, PhoneNumber phoneNumber) {
        appendChange(new ClientPhoneNumberUpdated(entityId, phoneNumber)).apply();
    }

    // Employee Behaviors
    public void AddEmployee(EmployeeId entityId, Name name, Email email) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(email);
        appendChange(new EmployeeAdded(entityId, name, email)).apply();
    }

    protected Optional<Employee> getEmployeeById(EmployeeId entityId) {
        return employees()
                .stream()
                .filter(employee -> employee.identity().equals(entityId))
                .findFirst();
    }

    public void UpdateEmployeeName(EmployeeId entityId, Name name) {
        appendChange(new EmployeeNameUpdated(entityId, name)).apply();
    }

    public void UpdateEmployeeEmail(EmployeeId entityId, Email email) {
        appendChange(new EmployeeEmailUpdated(entityId, email)).apply();
    }

    // Product Behaviors
    public void AddProduct(ProductId entityId, Name name, Price price) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(price);
        appendChange(new ProductAdded(entityId, name, price)).apply();
    }

    protected Optional<Product> getProductById(ProductId entityId) {
        return products()
                .stream()
                .filter(product -> product.identity().equals(entityId))
                .findFirst();
    }

    public void UpdateProductName(ProductId entityId, Name name) {
        appendChange(new ProductNameUpdated(entityId, name)).apply();
    }

    public void UpdateProductPrice(ProductId entityId, Price price) {
        appendChange(new ProductPriceUpdated(entityId, price)).apply();
    }
}
