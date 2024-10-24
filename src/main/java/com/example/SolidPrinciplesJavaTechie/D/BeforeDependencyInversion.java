package com.example.SolidPrinciplesJavaTechie.D;

/*
    This class is tightly coupled with Debit card lets say if we want to purchase with credit card
    then we need to change the implementation , dependencies , constructor .
 */
public class BeforeDependencyInversion {
    private DebitCard debitCard;

    public BeforeDependencyInversion(DebitCard debitCard)
    {
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard1 = new DebitCard();
        BeforeDependencyInversion beforeDependencyInversion = new BeforeDependencyInversion(debitCard1);
        beforeDependencyInversion.doPurchaseSomething(5000);
    }
}
