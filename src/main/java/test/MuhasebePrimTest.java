package test;
import muhasebe.Employee;
import muhasebe.EmployeeSalary;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MuhasebePrimTest{

    @Test
    public void testSalaryCalculate(){
        EmployeeSalary employeeSalary=new EmployeeSalary(28,35000);
        int result=employeeSalary.salaryCalculate();
        Assert.assertEquals(result,42200,"Methodu yanlış");
    }

    @DataProvider(name = "testSalaryDP")
    public Object[][] testSalaryDP(){
        return new Object[][]{
                {26,30000,32200},
                {27,28000,32240},
                {25,40000,35000}
        };
    }

    @Test(dataProvider = "testSalaryDP")
    public void testSalaryCalculateDP(int workDay, int monthSalary, int exValue){
        EmployeeSalary employeeSalary=new EmployeeSalary(workDay,monthSalary);
        int result=employeeSalary.salaryCalculate();
        Assert.assertEquals(result,exValue);
    }
}


