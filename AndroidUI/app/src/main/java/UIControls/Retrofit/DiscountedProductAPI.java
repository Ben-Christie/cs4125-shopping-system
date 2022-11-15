package UIControls.Retrofit;

public interface DiscountedProductAPI {
  @GET("/discounted-product/get-all")
  Call<List<DiscountedProductEntity>> getAllDiscountedProducts();

}
