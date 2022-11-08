package Database;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import Database.DBEntity.ProductDBEntity;
import system.ui.R;

public class ProductDatabase extends ConnectDatabase {
    List<ProductDBEntity> productDBEntityList = new ArrayList<>();

    public ProductDatabase(Context context) {
        super(context, R.raw.products);

        parseCSV();
    }

    private void parseCSV() {
        String[] dataFields = dbInformation.split(",");

        // check that all dataFields are full, no missing data
        if(dataFields.length % 3 != 0 || dataFields.length < 3) {
            System.out.println("Error: number of data fields is incorrect");
        } else {
            for(int i = 0; i < dataFields.length; i += 3) {
                int id = Integer.parseInt(dataFields[i]);
                String name = dataFields[i + 1];
                double price = Double.parseDouble(dataFields[i + 2]);

                ProductDBEntity product = new ProductDBEntity(id, name, price);
                productDBEntityList.add(product);
            }
        }
    }

    public int getProductId(String name) {
        for(ProductDBEntity product : productDBEntityList) {
            if(product.getProductName().equals(name)) {
                return product.getProductId();
            }
        }
        return -1;
    }

    public String getProductName(int id) {
        for(ProductDBEntity product : productDBEntityList) {
            if(product.getProductId() == id) {
                return product.getProductName();
            }
        }
        return "";
    }

    public double getProductPrice(String name) {
        for(ProductDBEntity product : productDBEntityList) {
            if(product.getProductName().equals(name)) {
                return product.getProductPrice();
            }
        }
        return -1.0;
    }
}
