/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.ArrayList;
import mybank.Account;
import mybank.CheckingAccount;
import mybank.SavingAccount;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author erani
 */
public class AccountTest {
    Account a1;
    Account a2;
    public AccountTest() {
           }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
            public void testAccount(){
     ArrayList<Account> accountList = new ArrayList<Account>();
         Account  a1 = new SavingAccount("1",15);
         Account  a2 = new CheckingAccount ("2",50);
        accountList.add(a1);
        accountList.add(a2);
            }
}
