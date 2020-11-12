package org.example;
import Pageobjects.Loginpage;
import Resources.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage extends BaseClass {
    @Test(dataProvider = "getdata")
    public void basePageNavigation(String UserName , String EmailId) throws IOException{
        driver=initializeDriver();
        driver.get("https://rahulshettyacademy.com/");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        Loginpage l= new Loginpage(driver);
        l.PractiseProject().click();
        l.Email().sendKeys(EmailId);
        l.Name().sendKeys(UserName);
        l.SubmitBtn().click();
        String ActualValue=l.ConfirmLogin().getText();
        System.out.println(ActualValue);
        driver.close();

    }
    @DataProvider
    public Object[][] getdata()
    {
        Object[][] data=new Object[2][2];
        data[0][0]="Nandini";
        data[0][1]="nkpavuluri@gmail.com";
        data[1][0]="Nandini";
        data[1][1]="nandini.kp7@gmail.com";
        return data;

    }

}
