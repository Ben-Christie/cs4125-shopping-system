package Model.Purchase;

public class PurchaseInfoEntity implements IPurchaseInfoEntity {
    String name;
    double price;



    public PurchaseInfoEntity(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
