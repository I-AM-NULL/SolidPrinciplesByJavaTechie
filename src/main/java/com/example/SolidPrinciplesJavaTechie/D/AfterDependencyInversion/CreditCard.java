package com.example.SolidPrinciplesJavaTechie.D.AfterDependencyInversion;

public class CreditCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
        System.out.println("payment using Credit card");
    }
}
