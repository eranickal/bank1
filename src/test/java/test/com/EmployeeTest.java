/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.ArrayList;
import mybank.ContractorEmployee;
import mybank.Employee;
import mybank.FullTiimeEmployee;
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
public class EmployeeTest {
    Employee e1;
    Employee e2;
    public EmployeeTest() {
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
    public void testEmployee(){
        ArrayList <Employee> employeeList = new ArrayList<Employee>();
       
        Employee e1 = new FullTiimeEmployee(2000, 1, "tom" , "tom@abc.com");
        Employee e2 = new ContractorEmployee(30, 1, "jamin" , "jamin@abc.com");
       
        employeeList.add(e1);
        employeeList.add(e2);
    }
}
