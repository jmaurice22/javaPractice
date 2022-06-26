package orders;

import com.customers.Customers;

public class Order {
    public int  orderNumber = 0;
    public String customerName = "";


    public Order(Customers customer) {
        orderNumber ++;
        this.customerName = customer.getFullName();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void incrementOrderNumber() {
        orderNumber++;
    }



}
