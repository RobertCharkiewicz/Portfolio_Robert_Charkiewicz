package Lekcja4_zadanie2;

public class Test {

    public static void main(String[] args) {

        Customer customer1 = new Customer("customer 1 name", "customer 1 surname", 1);
        Customer customer2 = new Customer("customer 2 name", "customer 2 surname", 2);

        Product product1 = new Product(100, "product 1 name",
                "product 1 manufacturer");
        Product product2 = new Product(200, "product 2 name",
                "product 2_manufacturer");
        Product product3 = new Product(300, "product 3 name",
                "product 3 manufacturer");

        Order order1 = new Order(customer1);
        Order order2 = new Order(customer2);

        order1.addProductToList(product1);
        order1.addProductToList(product2);
        order1.addProductToList(product3);

        order1.calculateOrderValue();

    }

}