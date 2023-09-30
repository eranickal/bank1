/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mybank;

import java.util.ArrayList;

/**
 *
 * @author erani
 */
public class BusinessCustomer extends Customer{
    private String ein;

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public BusinessCustomer(String ein, int CID, String fname, String lname, String email, String phone, ArrayList<Account> accounts) {
        super(CID, fname, lname, email, phone, accounts);
        this.ein = ein;
    }

    @Override
    public String toString() {
        return "BusinessCustomer{" + "ein=" + ein + " "+ super.toString() + '}';
    }

  
}
