package Constructors;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {



        //calling constructor
        BankAcccount aaravAccount=new BankAcccount("tim","vickyjnv7@gmail.com","9784674964");
        BankAcccount vickyAccount=new BankAcccount("12345",0.00,"vickyjnv7@gmail.com","vicky","9784674964");

        //commenting because above constructor has done this for me
//        vickyAccount.setAccountNumber("12345");
//        vickyAccount.setAccountNumber("vicky kumar");
//        vickyAccount.setBalance(0.00);
//        vickyAccount.setCustEmail("vickyjnv7@gmail.com");
//        vickyAccount.setCustPhone("9784674964");
        System.out.println(vickyAccount.getCustName());

        System.out.println(aaravAccount.getAccountNumber());


//calling methods
        vickyAccount.withdrawl(100);
        vickyAccount.deposit(50.0);
        vickyAccount.withdrawl(100);
        vickyAccount.deposit(51.0);
        vickyAccount.withdrawl(100);


    }
}
