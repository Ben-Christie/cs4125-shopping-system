package com.shopmanagementsystem.spring.Mappers;

import com.shopmanagementsystem.spring.DTO.ProductDTO;
import com.shopmanagementsystem.spring.Entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductMapper implements Mapper<ProductDTO, Product>{

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDTO entityToDTO(Product product) {
        ProductDTO productDTO = modelMapper.map(product,ProductDTO.class);
        return productDTO;
    }

    @Override
    public Product DTOToEntity(ProductDTO productDTO) {
        Product product = modelMapper.map(productDTO,Product.class);
        return product;
    }
}
