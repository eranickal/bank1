/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mybank;

/**
 *
 * @author erani
 */
public interface Account {
     public String getaccountnumber();
    public void deposit (double amount);
    public void withdraw( double amount);
    public void applyInterest();
    public double getBalance();
    
}
