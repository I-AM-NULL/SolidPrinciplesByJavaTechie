package com.example.SolidPrinciplesJavaTechie.D.AfterDependencyInversion;

public class DebitCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
            System.out.println("payment using Debit card");

    }
}
