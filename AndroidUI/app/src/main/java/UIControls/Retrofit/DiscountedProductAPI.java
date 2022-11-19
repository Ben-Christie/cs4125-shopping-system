package UIControls.Retrofit;

import java.util.List;

import UIControls.DTO.DiscountedProductEntity;
import retrofit2.Call;
import retrofit2.http.GET;

public interface DiscountedProductAPI {
  @GET("/discounted-product/get-all")
  Call<List<DiscountedProductEntity>> getAllDiscountedProducts();

}
