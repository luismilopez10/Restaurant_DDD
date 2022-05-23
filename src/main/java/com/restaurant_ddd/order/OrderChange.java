package com.restaurant_ddd.order;

import co.com.sofka.domain.generic.EventChange;
import com.restaurant_ddd.order.events.*;

import java.util.HashSet;

public class OrderChange extends EventChange {
    public OrderChange(Order order) {

        apply((OrderCreated event) -> {
            order.totalPrice = event.getTotalPrice();
            order.clients = new HashSet<>();
            order.employees = new HashSet<>();
            order.products = new HashSet<>();
        });


        // Client events
        apply((ClientAdded event) -> {
            var numClients = order.clients().size();

            if (numClients == 1) {
                throw new IllegalArgumentException("The order can only have one client");
            }

            order.clients.add(new Client(
                    event.getClientId(),
                    event.getName(),
                    event.getPhoneNumber()
            ));
        });

        apply((ClientNameUpdated event) -> {
            var client = order.getClientById(event.getClientId())
                    .orElseThrow(() -> new IllegalArgumentException("Client not found in the current order"));

            client.updateName(event.getName());
        });

        apply((ClientPhoneNumberUpdated event) -> {
            var client = order.getClientById(event.getClientId())
                    .orElseThrow(() -> new IllegalArgumentException("Client not found in the current order"));

            client.updatePhoneNumber(event.getPhoneNumber());
        });


        // Employee events
        apply((EmployeeAdded event) -> {
            var numEmployees = order.employees().size();

            if (numEmployees == 1) {
                throw new IllegalArgumentException("The order can only have one employee");
            }

            order.employees.add(new Employee(
                    event.getEmployeeId(),
                    event.getName(),
                    event.getEmail()
            ));
        });

        apply((EmployeeNameUpdated event) -> {
            var employee = order.getEmployeeById(event.getEmployeeId())
                    .orElseThrow(() -> new IllegalArgumentException("Employee not found in the current order"));

            employee.updateName(event.getName());
        });

        apply((EmployeeEmailUpdated event) -> {
            var employee = order.getEmployeeById(event.getEmployeeId())
                    .orElseThrow(() -> new IllegalArgumentException("Employee not found in the current order"));

            employee.updateEmail(event.getEmail());
        });


        // Product events
        apply((ProductAdded event) -> {
            var numProducts = order.products().size();

            if (numProducts < 1) {
                throw new IllegalArgumentException("The order must have at least one product");
            }

            order.products.add(new Product(
                    event.getProductId(),
                    event.getName(),
                    event.getPrice()
            ));
        });

        apply((ProductNameUpdated event) -> {
            var product = order.getProductById(event.getProductId())
                    .orElseThrow(() -> new IllegalArgumentException("Product not found in the current order"));

            product.updateName(event.getName());
        });

        apply((ProductPriceUpdated event) -> {
            var product = order.getProductById(event.getProductId())
                    .orElseThrow(() -> new IllegalArgumentException("Product not found in the current order"));

            product.updatePrice(event.getPrice());
        });
    }
}
