package money;

public class Tester {
    public static void main(String[] args) {
        Account defult=new Account();
        System.out.println("defult balance: "+defult.getBalance()+" defult annual rate: "+defult.getAnnualInterestRate()+" defult id: "+defult.getId());
        Account x1=new Account(7700,25000);
        x1.setAnnualInterestRate(4);
        x1.withdraw(5000);
        System.out.println("Balance is: "+x1.getBalance()+"$");
        x1.deposit(3000);
        System.out.println("Balance is: "+x1.getBalance()+"$");
        System.out.println(x1.getMonthlyInterest());
        System.out.println(x1.getDateCreated());
        System.out.println("------------------------------");
        Account x2=new Account(1111,3500);
        x2.setAnnualInterestRate(7);
        x2.withdraw(5000);
        System.out.println(x2.getMonthlyInterest()+"$");
        System.out.println("Balance is: "+x2.getBalance()+"$");
    }
}
