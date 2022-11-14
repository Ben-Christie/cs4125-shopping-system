package com.shopmanagementsystem.spring.Database.DBEntity;

@Entity
public class DiscountedProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int discountAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscountAvailable() {
        return discountAvailable;
    }

    public void setDiscountAvailable(int discountAvailable) {
        this.discountAvailable = discountAvailable;
    }

    @Override
    public String toString() {
        return "DiscountedProduct{" +
                "id=" + id +
                ", name=" + name +
                ", discount available=" + discountAvailable +
                "}";
    }
}