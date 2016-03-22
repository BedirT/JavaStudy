package lab14;
//************************************************************
// ProcessTransactions.java
//
// A class to process deposits and withdrawals for two bank
// accounts for a single day.
//************************************************************

import java.util.Scanner;

public class Lab14 {

    public static void main(String[] args) {
        Account acct1, acct2; //two test accounts

        String action; //deposit or withdraw
        double amount; //how much to deposit or withdraw
        long acctNumber; //which account to access
        Scanner scan = new Scanner(System.in);
        System.out.println("How many days you want to enter ?");
        int days = scan.nextInt();
        acct1 = new Account(1000, "Sue", 123);
        acct2 = new Account(1000, "Joe", 456);
        for (int j = 0; j < days; j++) {
            String keepGoing = "y"; //more transactions?

            System.out.println("The following accounts are available: \n");
            System.out.println("" + acct1.toString());
            System.out.println("" + acct2.toString());

            while (keepGoing.equals("Y") || keepGoing.equals("y")) {
//get account number, what to do, and amount
                System.out.print("\nEnter the number of the account you would like to access: ");
                acctNumber = scan.nextLong();
                System.out.print("Would you like to make a deposit (D) or withdrawal (W) ? ");

                action = scan.next();
                System.out.print("Enter the amount: ");
                amount = scan.nextDouble();
                if (amount > 0) {
                    if (acctNumber == acct1.getAcctNumber()) {
                        if (action.equals("w") || action.equals("W")) {
                            acct1.withdraw(amount);
                        } else if (action.equals("d") || action.equals("D")) {
                            acct1.deposit(amount);
                        } else {
                            System.out.println("Sorry, invalid action.");
                        }
                    } else if (acctNumber == acct2.getAcctNumber()) {
                        if (action.equals("w") || action.equals("W")) {
                            acct1.withdraw(amount);
                        } else if (action.equals("d") || action.equals("D")) {
                            acct1.deposit(amount);
                        } else {
                            System.out.println("Sorry, invalid action. ");
                        }
                    } else {
                        System.out.println("Sorry, invalid account number. ");
                    }
                } else {
                    System.out.println("Sorry, amount must be > 0 . ");
                }
                System.out.print("\nMore transactions? (y/n)");
                keepGoing = scan.next();
            }
            System.out.println("\nTotal number of deposits are : " + Account.getNumDeposits());
            System.out.println("Total number of withdrawals are : " + Account.getNumWithdrawals());
            System.out.println("Total total amount of deposits are : " + Account.getValueDeposits());
            System.out.println("Total total amount of withdrawals are : " + Account.getValueWithdrawals());

        }
       
        acct1.varReset();
        acct2.varReset();

    }
}
