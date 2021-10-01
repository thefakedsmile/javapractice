package Constructors;

import javax.management.BadBinaryOpValueExpException;

public class BankAcccount {
    private String accountNumber;
    private double balance;
    private String custName;
    private String custEmail;
    private String custPhone;
//defining empty constructor
//    public BankAcccount(){
//        System.out.println("empty constructor called");
//    }
//defining constructor and a constructor has no return type
    public BankAcccount(String accountNumber,double balance,String custEmail,String custName,String custPhone){
        System.out.println("Account parameter with constructor called");
        this.accountNumber=accountNumber;
        //or we initialize  setter by
        // we can not do it because
        // if we have to check any condition
        // while setting any value
        // we cannot go with this approach
        //setAccountNumber(accountNumber);
        this.balance=balance;
        this.custName=custName;
        this.custEmail=custEmail;
        this.custPhone=custPhone;
    }

    //initalizing a constructor with 2 default values


    public BankAcccount(String custName, String custEmail, String custPhone) {
        this("55555",55.0,custName,custEmail,custPhone);
    }

    //calling a constructor with other constructor //default values for constuctor for not using an empty constructor
    public BankAcccount(){
        this("56789",2.50,"default email","default name","default phone");
        System.out.println("empty constructor was called default");
    }

//defining method
    public void deposit(double depositAmount){
        this.balance+=depositAmount;
    }


    //defining method and a method has return type if it is not void
    public void withdrawl(double withdrawlAmount){
        if(balance-withdrawlAmount<=0){
            System.out.println("only "+this.balance+"avilable withdrawl not processed");
        }else {
            this.balance-=withdrawlAmount;
            System.out.println("withdrawl of "+ withdrawlAmount+" processed "+this.balance);
        }
    }









    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}
