package Model.Purchase.Order;

public class ProductEntity {
    String name;
    String price;

    public ProductEntity(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}

