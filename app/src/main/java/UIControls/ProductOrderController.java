package UIControls;

import android.content.Context;

import java.util.List;

import Database.ProductDatabase;
import Model.Purchase.Order.DisplayProducts;
import Model.Purchase.Order.ProductEntity;


public class ProductOrderController {
    DisplayProducts dp;


    public ProductOrderController(Context context){
        dp = new DisplayProducts(context);
    }

    public List<ProductEntity> listOfProducts(){
        return dp.allProducts();
    }



}
