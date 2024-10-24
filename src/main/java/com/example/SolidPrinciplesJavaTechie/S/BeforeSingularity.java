package com.example.SolidPrinciplesJavaTechie.S;

/* This class has many functionalities/reasons to change for example
        1st reason) getLoanInterestInfo() has only 3 types now lets say in future it may introduce  Education Loan
        2nd reason) sendOtp() has only one medium now lets say in future they may introduce through messages , whatsapp
 */
public class BeforeSingularity {

    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }

    public void printPassbook() {
        //update transaction info in passbook
    }

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            //do some job
        }
        if (loanType.equals("personalLoan")) {
            //do some job
        }
        if (loanType.equals("car")) {
            //do some job
        }
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}
