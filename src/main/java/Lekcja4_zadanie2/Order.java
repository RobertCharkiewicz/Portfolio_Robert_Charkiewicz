package Lekcja4_zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Customer customer;
    private int orderValue = 0; //

    private List<Product> productList = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

//  to jest ogolna metoda, ktora dodaje produkty do listy:
    public void addProductToList(Product product) {
        this.productList.add(product);
    }
// to jest ogolna metoda, ktora kalkuluje wartosc zamowienia dodajac cene produktu do wartosci zamowienia:
    public void calculateOrderValue() {
        for (Product product : productList) {
            orderValue = orderValue + product.getPrice();
        }

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(int orderValue) {
        this.orderValue = orderValue;
    }

    public int getNumberOfElements() {
        return productList.size();
    }

}
