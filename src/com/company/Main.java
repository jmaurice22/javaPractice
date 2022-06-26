package com.company;
import java.util.*;
import com.customers.*;
import orders.Order;


public class Main {
    public static void main(String[] args) {
;     // Create an ArrayList of type Customers
        ArrayList<Customers> customersArrayList = new ArrayList<Customers>();

        Customers customer1 = new Customers(
                "John",
                "Doe",
                "jpostell29@gmail.com",
                "123-456-7890",
                "123 Main St.",
                "Software Engineer");

//        System.out.println("Hello " + customer1.getFullName());
//        System.out.println("Your email is " + customer1.getEmail());
//        System.out.println("Your phone number is " + customer1.getPhoneNumber());
//        System.out.println("Your address is " + customer1.getAddress());
//        System.out.println("Your job title is " + customer1.getJobTitle());
//        System.out.println("");




        Customers customer2 = new Customers(
                "Julian",
                "Postell",
                "jpostell29@gmail.com",
                "7326183815",
                "2222 N McQueen Rd. Apt 2101, Chandler, AZ 85249",
                "Software Engineer");


//        System.out.println("Hello " + customer2.getFullName());
//        System.out.println("Your email is " + customer2.getEmail());
//        System.out.println("Your phone number is " + customer2.getPhoneNumber());
//        System.out.println("Your address is " + customer2.getAddress());
//        System.out.println("Your job title is " + customer2.getJobTitle());
//        System.out.println("");
//        System.out.println("");

        customersArrayList.add(customer1);
        customersArrayList.add(customer2);

//        for(Customers customer : customersArrayList) {
//            System.out.println(customer.getFullName());
//            System.out.println(customer.getAddress());
//            System.out.println(customer.getJobTitle());
//            System.out.println("");
//        }

        Order myordeer = customer2.createOrder(customer2);
        customer2.placeOrder(customer2, myordeer);
        Order orderDetails = customer2.getOrder(customer2, myordeer);
        System.out.println("Order number: " + orderDetails.getOrderNumber());
        System.out.println("Customer name: " + orderDetails.getCustomerName());
       
        Order myorder2 = customer1.createOrder(customer1);
        customer1.placeOrder(customer1, myorder2);
        Order orderDetails2 = customer1.getOrder(customer1, myorder2);
        System.out.println("Order number: " + orderDetails2.getOrderNumber());
        System.out.println("Customer name: " + orderDetails2.getCustomerName());

//        System.out.println(myordeer.getOrderNumber() + " " + myordeer.getCustomerName());






    }


}
