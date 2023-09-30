/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.ArrayList;
import mybank.BusinessCustomer;
import mybank.Customer;
import mybank.IndividualCustomer;
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
public class CustomerTest {
    Customer c1;
    Customer c2;
    public CustomerTest() {
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
    public void testCustomer(){
         ArrayList<Customer> customerList = new ArrayList<Customer>();
         
         Customer c1 = new IndividualCustomer("4",1,"mat","era","mat@abc.com","345087322",null);
        Customer c2 = new BusinessCustomer ("1",1,"amy","scott","amy@abc.com","123456789",null);
        
        customerList.add(c1);
        customerList.add(c2);
    }
}
