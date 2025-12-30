package com.bank.customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
    private Map<String, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public Customer getCustomer(String customerId) {
        return customers.get(customerId);
    }

    public void listCustomers() {
        for (Customer c : customers.values()) {
            System.out.println("ID: " + c.getCustomerId() + ", Name: " + c.getName());
        }
    }
}
