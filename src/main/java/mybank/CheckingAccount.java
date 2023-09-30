/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mybank;

/**
 *
 * @author erani
 */
public class CheckingAccount implements Account{
     private String CAC; 
    private double balance; 

    public CheckingAccount(String CAC, double balance) {
        this.CAC = CAC;
        this.balance = balance;
    }
     @Override
    public String getaccountnumber(){
        String accountn = this.CAC;
        return accountn;
    };
    
    
    @Override
    public void deposit(double amount) {
       balance += amount; 
    }

    @Override
    public void withdraw(double amount) {
       balance -= amount; 
    }

    @Override
    public double getBalance() {
        return balance; 
    }

    public String getCAC() {
        return CAC;
    }

    public void setSAC(String CAC) {
        this.CAC = CAC;
    }

    public void applyInterest() {
        balance += balance * 1.25/100; 
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + "CAC=" + CAC + ", balance=" + balance + '}';
    }


    
}
