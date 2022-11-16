package com.shopmanagementsystem.spring.model.Purchase.Order;

import com.shopmanagementsystem.spring.Database.DAO.ProductDAO;
import com.shopmanagementsystem.spring.Database.DBModel.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DisplayProducts {
    @Autowired
    private ProductDAO productDAO;

    public List<Product> displayAll() {
        return productDAO.getAllProducts();
    }

}
