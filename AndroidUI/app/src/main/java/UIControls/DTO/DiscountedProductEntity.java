package UIControls.DTO;

public class DiscountedProduct {
  int id;
  String name;
  int discountAvailable;

  public DiscountedProduct(String name, int discountAvailable) {
    this.name = name;
    this.discountAvailable = discountAvailable;
  }

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