package com.shopmanagementsystem.spring.Mappers;

import com.shopmanagementsystem.spring.DTO.ReceiptDTO;
import com.shopmanagementsystem.spring.Entity.Receipt;

public class ReceiptMapper implements Mapper<ReceiptDTO, Receipt>{

    @Override
    public ReceiptDTO entityToDTO(Receipt receipt) {
        ReceiptDTO receiptDTO = new ReceiptDTO();
        receiptDTO.setReceiptContent(receipt.getProducts());
        return receiptDTO;
    }

    @Override
    public Receipt DTOToEntity(ReceiptDTO receiptDTO) {
        Receipt receipt = new Receipt();
        receipt.setProducts(receiptDTO.getReceiptContent());
        return receipt;
    }
}
