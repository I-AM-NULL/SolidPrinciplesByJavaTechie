package com.example.SolidPrinciplesJavaTechie.I;

public class Phonepay implements BeforeInterfaceSegregation{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashback() {
        // lets say cashback feature is not there in Phonepay . so here phonepay is forced to implement Interface
    }
}
