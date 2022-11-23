package com.shopmanagementsystem.spring.Database.DAO;

import com.shopmanagementsystem.spring.Entity.Product;
import com.shopmanagementsystem.spring.Database.Repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartDAO {

    @Autowired
    private CartRepo cartRepo;

    public void addProduct(Product product){
        cartRepo.save(product.toCart());
    }

    public void clearCart(){
        cartRepo.deleteAll();
    }

    public List<Product> getCart(){
        List<Product> products = new ArrayList<>();
        Streamable.of(cartRepo.findAll())
                .forEach(product -> {
                    products.add(product.toProduct());
                });
        return products;
    }
}
