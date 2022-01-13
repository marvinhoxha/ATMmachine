package money;

import java.util.Scanner;

public class ATM {
    public static void displaymenu(){
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4.Exit Menu");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Account[] array = new Account[5];
        for (int i = 0; i<5; i++){
            array[i]=new Account (i,100+(i*100));
        }
        while (true){
            displaymenu();
            System.out.println("Enter your id :");
            int id=input.nextInt();
            System.out.println("Enter your choice:");
            int choice= input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Your balance is: "+array[id].getBalance()+"$");
                    break;
                case 2:
                    System.out.println("Enter Withdraw amount: ");
                    double amount= input.nextDouble();
                    array[id].withdraw(amount);
                    break;
                case 3:
                    System.out.println("Enter Deposit amount: ");
                    double deposit= input.nextDouble();
                    array[id].deposit(deposit);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}
