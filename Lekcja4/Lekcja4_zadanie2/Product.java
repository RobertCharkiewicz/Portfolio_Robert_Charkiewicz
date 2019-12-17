package Lekcja4_zadanie2;

public class Product {
    private int price;
    private String productName;
    private String productManufacturer;

    public Product(int price, String productName, String productManufacturer) {
        this.price = price;
        this.productName = productName;
        this.productManufacturer = productManufacturer;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0)
            this.price = price;
        else {
            System.out.println("Wrong price. It must be > 0");
        }
    }

    public boolean verifyProductNameLength(String productName) {
        if (productName.length() <= 30) {
            return true;
        }
        return false;
    }

    public boolean verifyProductManufacturerLength(String productManufacturer) {
        if (productManufacturer.length() <= 30) {
            return true;
        }
        return false;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {

        if (verifyProductNameLength(productName)) {
            this.productName = productName;
        }
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {

        if (verifyProductNameLength(productManufacturer)) {
            this.productManufacturer = productManufacturer;
        }
    }

}