package com.shopmanagementsystem.spring.Database.DAO;


import com.shopmanagementsystem.spring.Entity.Product;
import com.shopmanagementsystem.spring.Database.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductDAO {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        Streamable.of(productRepo.findAll())
                .forEach(product -> {
                    products.add(product);
                });
        return products;
    }



}
