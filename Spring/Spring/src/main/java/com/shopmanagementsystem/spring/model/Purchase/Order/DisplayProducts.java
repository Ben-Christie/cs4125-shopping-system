package com.shopmanagementsystem.spring.model.Purchase.Order;

import com.shopmanagementsystem.spring.Database.DAO.ProductDAO;
import com.shopmanagementsystem.spring.Database.DAO.UserDAO;
import com.shopmanagementsystem.spring.Database.DBEntity.Product;
import com.shopmanagementsystem.spring.Database.DBEntity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Component
public class DisplayProducts {
    @Autowired
    private ProductDAO productDAO;


    public List<Product> displayAll(){
           return productDAO.getAllProducts();
    }

}
