package Model.Purchase.Order;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;


public class DisplayProducts {
    //ProductDatabase pd;
    List<ProductEntity> products = new ArrayList<>();

    public DisplayProducts(Context context){

        //pd = new ProductDatabase(context);
    }

    /*
    Retrieve all products from the database
     */
    public List<ProductEntity> allProducts(){
//        for(int i = 1; i <= pd.getAmountOfProducts(); i ++){
//            products.add(new ProductEntity(pd.getProductName(i),pd.getProductPrice(i)));
//        }
        return products;
    }
}
