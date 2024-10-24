package com.example.SolidPrinciplesJavaTechie.I;

public class Paytm implements BeforeInterfaceSegregation{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashback() {
        // lets say cashback feature is not there in paytm . so here paytm is forced to implement Interface
    }
}
