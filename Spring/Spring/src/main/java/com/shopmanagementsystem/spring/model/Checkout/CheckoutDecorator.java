package com.shopmanagementsystem.spring.model.Checkout;

public abstract class CheckoutDecorator extends Checkout{
    @Override
    public abstract Receipt getReceipt();
}
