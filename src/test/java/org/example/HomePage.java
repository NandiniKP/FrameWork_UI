package org.example;
import Pageobjects.Loginpage;
import Pageobjects.PractiseProjects;
import Resources.BaseClass;
import javafx.css.CssMetaData;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage extends BaseClass {


    @Test(dataProvider = "getdata")
    public void basePageNavigation(String UserName , String EmailId) throws IOException{
        driver=initializeDriver();
        driver.get(prop.getProperty("loginurl"));
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        Loginpage l= new Loginpage(driver);
        l.PractiseProject().click();
        l.Email().sendKeys(EmailId);
        l.Name().sendKeys(UserName);
        l.SubmitBtn().click();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        PractiseProjects p= new PractiseProjects(driver);
        p.AutomationProject1().click();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        Assert.assertTrue(p.Greenkartlogo().isDisplayed());
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
