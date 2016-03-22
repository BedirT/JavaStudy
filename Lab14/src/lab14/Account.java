/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/**
 *
 * @author BedirTapkan
 */
// *******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
// *******************************************************
public class Account {

    private double balance;
    private String name;
    private long acctNum;
    private static int withdrawalsCount;
    private static int withdrawalsAmount;
    private static int depositCount;
    private static int depositAmount;
    
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            withdrawalsAmount+=amount;
            withdrawalsCount++;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        depositAmount+=amount;
        depositCount++;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        String all = (name +" "+ acctNum +" "+ balance);
        return all;
    }

    public double chargeFee() {
        balance -= 10;
        
        return balance;
    }

    public String changeName(String newName) {
        return name = newName ;
    }

    public long getAcctNumber() {
        return acctNum;
    }
    
    public static int getNumDeposits(){
        return depositCount;
    }
    
    public static int getValueDeposits(){
        return depositAmount;
    }
    
    public static int getNumWithdrawals(){
        return withdrawalsCount;
    }
    
    public static int getValueWithdrawals(){
        return withdrawalsAmount;
    }
    
    public void varReset(){
        depositAmount=0;
        depositCount=0;
        withdrawalsAmount=0;
        withdrawalsCount=0;
    }
    
}
