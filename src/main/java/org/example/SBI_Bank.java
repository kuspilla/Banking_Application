package org.example;

public class SBI_Bank implements RBI_Bank_Interface {
    private double balance;
    private String password;
    private String account_number;
    private double rate_of_intrest = 6;
     private int minimum_balance = 500;

     public SBI_Bank(String account_number, String password, double balance){
         this.account_number = account_number;
         this.balance = balance;
         this.password = password;
     }
     public String deposit_money(double money){
         if(money > 0){

             balance = balance + money;
             return "Money added "+money + " total balance: " +balance;

         }
         else {
             return "money enterd is negitive";
         }

     }



    public String withdraw_money(double money, String password){
         if( password.equals(this.password)) {
             if (balance - minimum_balance >= money) {
                 balance = balance - money;
                 return "Money withdraw " + money + " remaining Balance " + balance;
             } else {
                 return "Insufficient balance minimum balance that needs to supported is " + minimum_balance;
             }
         }
         else{
             return "Worng password entered";
             }
     }
     public String check_balance(String password){
         if( password.equals(this.password)){
             return "The balanece is "+ balance;
         }
         else{
             return "Worng password entered";
         }
     }
     public double caluclate_intrest(int time){
         double simple_intrest = (balance * time * rate_of_intrest)/100;
         return simple_intrest;
     }
}
