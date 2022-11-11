package UIControls;

import android.content.Context;

import java.util.List;

import Database.ProductDatabase;
import Model.Purchase.Order.DisplayProducts;
import Model.Purchase.Order.OrderProduct;
import Model.Purchase.Order.ProductEntity;


public class ProductOrderController {
    DisplayProducts dp;
    OrderProduct op;


    public ProductOrderController(Context context){
        dp = new DisplayProducts(context);
        op = new OrderProduct();
    }

    public List<ProductEntity> listOfProducts(){
        return dp.allProducts();
    }

    public boolean orderProduct(ProductEntity product){
        return op.addToCart(product);
    }

    public List<ProductEntity> displayOrder(){
        return op.displayOrder();
    }


}
