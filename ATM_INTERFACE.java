package com.full;
import java.util.Scanner;

class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance=initialBalance;
    }
    public double checkBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance+=amount;
    }
    public boolean withdraw(double amount) {
        if(amount>balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
            return false;
        }else{
            balance-=amount;
            System.out.println("Withdrawal successful. Remaining balance: "+balance);
            return true;
        }
    }
}
class ATM {
    private BankAccount bankAccount;
    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public void displayMenu() {
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
    }
    public void processTransaction(int option) {
        Scanner scanner=new Scanner(System.in);
        switch(option) {
            case 1:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount=scanner.nextDouble();
                if(withdrawAmount>0) {
                    bankAccount.withdraw(withdrawAmount);
                }else{
                    System.out.println("Invalid amount. Withdrawal failed.");
                }
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount=scanner.nextDouble();
                if(depositAmount>0) {
                    bankAccount.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: "+bankAccount.checkBalance());
                }else{
                    System.out.println("Invalid amount. Deposit failed.");
                }
                break;
            case 3:
                System.out.println("Current Balance: "+bankAccount.checkBalance());
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }
}
public class ATM_INTERFACE{
    public static void main(String[] args) {
        BankAccount userAccount=new BankAccount(1000.0); // Initial balance
        ATM atm=new ATM(userAccount);
        while (true) {
            atm.displayMenu();
            Scanner scanner=new Scanner(System.in);
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            atm.processTransaction(option);
        }
    }
}

