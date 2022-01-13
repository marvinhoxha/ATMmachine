package money;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated=new Date();
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public Account(){
        this.id=0;
        this.balance=0;
        this.annualInterestRate=0;
        this.dateCreated=new Date();
    }
    public Account(int id,double balance){
        this.setId(id);
        this.setBalance(balance);
    }


    public double getMonthlyInterestRate() {
        annualInterestRate/=100;
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return balance*(getMonthlyInterestRate());
    }
    public void withdraw(double withdrawamount){
         if (withdrawamount<=balance){
             System.out.println("You withdrawed: "+withdrawamount+"$");
             balance-=withdrawamount;
         }
         else System.out.println("You don't have enough $ :`(!");
    }

    public void deposit(double depositamount) {
        System.out.println("You succesfuly deposited: "+depositamount+"$");
        balance+=depositamount;
    }
}
