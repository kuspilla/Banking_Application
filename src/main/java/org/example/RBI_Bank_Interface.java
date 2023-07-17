package org.example;

public interface RBI_Bank_Interface {

    public String deposit_money(double money);
    public String withdraw_money(double money, String password);
    public String check_balance(String password);
    public double caluclate_intrest(int time);


}
