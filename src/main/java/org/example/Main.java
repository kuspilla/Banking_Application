package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Scanner sc = new Scanner(System.in);
        System.out.println("create account SBI Bank enter 1 \ncreate account Lotack Bank enter 2");

        int choice = sc.nextInt();


        System.out.print("Enter account opening money : ");
        double money = sc.nextDouble();
        System.out.println();
        System.out.print("Create password  6 digits enter: ");
        String password = sc.next();
        double account_temp = Math.abs(Math.random()* Math.pow(10,9));
        String account = account_temp+"";

        RBI_Bank_Interface Bank_interface ;
       if( choice == 1) {
           System.out.println("Account created SBI Bank Account number: " + account_temp + " password id: " + password);
           Bank_interface = new SBI_Bank(account, password, money);
       } else{
           System.out.println("Account created LOTACK Bank Account number " + account_temp + " password id: " + password);
           Bank_interface = new Lotak_Bank(account, password, money);
       }

       try {
           String requests = "Add money enter 1\nWithdraw money enter 2\nCheck Balance enter 3\nCaluculate Interest enter 4\nExit enter any another number";

           System.out.println(requests);

           while( true){
               int request = sc.nextInt();

               if(request == 1) {
                   System.out.print("Enter your Deposit money: ");
                   double amount = sc.nextDouble();
                   System.out.println( Bank_interface.deposit_money(amount) );
               }
               else if(request == 2) {
                   System.out.print("Enter Withdrawing money: ");
                   double withdraw = sc.nextDouble();
                   System.out.println(Bank_interface.withdraw_money(withdraw, password));
               } else if(request == 3) {
                   System.out.println(Bank_interface.check_balance(password));
               }else if(request == 4){
                   System.out.print(" enter deposit years  by calculate Interest: " );
                   int time = sc.nextInt();
                   System.out.println( Bank_interface.caluclate_intrest(time));
               }else{
                   System.out.println("Thank you ");
                   break;
               }
           }

       }
       catch (Exception e){
           System.out.println( e.toString());
       }
    }
}
