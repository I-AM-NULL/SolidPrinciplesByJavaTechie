package com.example.SolidPrinciplesJavaTechie.O;

/* this open-close principle states that if any new service like otp through whatsapp need to implement
   then instead of modifying in this class , extend the class and write whatsappOTP related code
 */
public class BeforeOpenClosePrinciple  {
    public void sendOTP(String medium){
        if(medium.equals("email")){
            //write email related logic
            //use JavaMailSenderAPI
        }

        if(medium.equals("mobile")){
            //write mobile related logic
        }


    }
}
