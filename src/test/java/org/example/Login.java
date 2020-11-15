package org.example;

import Pageobjects.Loginpage;
import Pageobjects.PractiseProjects;
import Resources.BaseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Login extends BaseClass {
    public static Logger log= LogManager.getLogger(BaseClass.class.getName());
    @Test
    public void Login() throws IOException {
        driver=initializeDriver();
        log.info("driver is initalized");
        driver.get(prop.getProperty("loginurl"));
        log.info("Navigated to login in URL ");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        Loginpage l= new Loginpage(driver);
        l.PractiseProject().click();
        l.Email().sendKeys("nkpavuluri@gmail.com");
        log.info("Email is entered test");
        l.Name().sendKeys("Nandini");
        log.info("Name  is entered");
        l.SubmitBtn().click();
        log.info("Button is clicked");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        PractiseProjects p= new PractiseProjects(driver);
        Assert.assertEquals(p.ValidationText().getText(),"OUR PROJECTS");
        p.AutomationProject1().click();
        log.info("Clicked on first automation project ");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        Assert.assertTrue(p.Greenkartlogo().isDisplayed());
        log.info("Validated user is able to view greenkart logo");
        driver.close();

    }

}
