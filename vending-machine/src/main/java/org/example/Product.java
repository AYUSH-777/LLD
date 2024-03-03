package org.example;

public class Product {
    private String productId;
    private Integer price;
    private Integer availableCount;
    private String name;

    public Product(String productId, Integer price, Integer availableCount, String name) {
        this.productId = productId;
        this.price = price;
        this.availableCount = availableCount;
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
