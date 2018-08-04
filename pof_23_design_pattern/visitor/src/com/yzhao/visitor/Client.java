package com.yzhao.visitor;

public class Client {
    public static void main(String[] args) {
        Customer customer1 = new Customer("customer1");
        customer1.addOrder(new Order("order1", "item1"));
        customer1.addOrder(new Order("order2", "item2"));
        customer1.addOrder(new Order("order3", "item3"));

        Order order = new Order("order_a");
        order.addItem(new Item("item_a1"));
        order.addItem(new Item("item_a2"));
        order.addItem(new Item("item_a3"));

        Customer customer2 = new Customer("customer2");
        customer2.addOrder(order);

        CustomerGroup customerGroup = new CustomerGroup();
        customerGroup.addCustomer(customer1);
        customerGroup.addCustomer(customer2);

        GeneralReport generalReport = new GeneralReport();
        customerGroup.accept(generalReport);
        generalReport.displayResults();
    }
}
