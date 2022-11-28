package com.shopmanagementsystem.spring.model.Checkout;

public abstract class CheckoutDecorator extends Checkout{
    protected Checkout checkout;

    public CheckoutDecorator(Checkout checkout){
        this.checkout = checkout;
    }

    @Override
    public abstract Receipt getReceipt();
}
