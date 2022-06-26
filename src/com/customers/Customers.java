package com.customers;
import orders.Order;

import java.util.ArrayList;
import java.util.HashMap;
public class Customers {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String address;
    String jobTitle;
//    ArrayList<Customers> customersArrayList = new ArrayList<Customers>();

    // Constructor
    public Customers() {
            this.firstName = "";
            this.lastName = "";
            this.email = "";
            this.phoneNumber = "";
            this.address = "";
            this.jobTitle = "";
    }
    public Customers(String firstName, String lastName, String email, String phoneNumber, String address, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.jobTitle = jobTitle;

    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Methods
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Order createOrder(Customers customer ) {
        return new Order(customer);
    }
    public void placeOrder(Customers customer, Order order) {
        String res = (order != null) ? "Order placed " + customer.firstName  : "Order not placed";
        System.out.println(res);
        order.incrementOrderNumber();
    }
    public Order getOrder(Customers customer, Order order) {
        return order;
    }
//    }
}

