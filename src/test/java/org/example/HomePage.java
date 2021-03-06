package org.example;
import Pageobjects.Loginpage;
import Pageobjects.PractiseProjects;
import Resources.BaseClass;
import javafx.css.CssMetaData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage extends BaseClass {

    public static Logger log= LogManager.getLogger(BaseClass.class.getName());
    @Test(dataProvider = "getdata")
    public void basePageNavigation(String UserName , String EmailId) throws IOException{

        driver=initializeDriver();
        log.info("driver is initalized");
        driver.get(prop.getProperty("loginurl"));
        log.info("Navigated to login in URL ");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        Loginpage l= new Loginpage(driver);
        l.PractiseProject().click();
        l.Email().sendKeys(EmailId);
        log.info("Email is entered");
        l.Name().sendKeys(UserName);
        log.info("Name  is entered");
        l.SubmitBtn().click();
        log.info("Button is clicked");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        PractiseProjects p= new PractiseProjects(driver);
        p.AutomationProject1().click();
        log.info("Clicked on first automation project ");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        Assert.assertTrue(p.Greenkartlogo().isDisplayed());
        log.info("Validated user is able to view greenkart logo");
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
