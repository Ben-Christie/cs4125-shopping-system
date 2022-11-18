package com.shopmanagementsystem.spring.Mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.shopmanagementsystem.spring.DTO.DiscountedProductDTO;
import com.shopmanagementsystem.spring.Entity.DiscountedProduct;

public class DiscountedProductMapper implements Mapper<DiscountedProductDTO, DiscountedProduct> {
  @Autowired
  private ModelMapper modelMapper;

  @Override
  public DiscountedProductDTO entityToDTO(DiscountedProduct discountedProduct) {
    DiscountedProductDTO discountedProductDTO = modelMapper.map(discountedProduct, DiscountedProductDTO.class);
    return discountedProductDTO;
  }

  @Override
  public DiscountedProduct DTOToEntity(DiscountedProductDTO discountedProductDTO) {
    DiscountedProduct discountedProduct = modelMapper.map(discountedProductDTO, DiscountedProduct.class);
    return discountedProduct;
  }

}
