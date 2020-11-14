package org.example;

import Pageobjects.Loginpage;
import Pageobjects.PractiseProjects;
import Resources.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Greenkart extends BaseClass {
    @Test
    public void Greenkart() throws IOException {
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        PractiseProjects p = new PractiseProjects(driver);
        Assert.assertTrue(p.Greenkartlogo().isDisplayed());
    }
    @AfterTest
    public void teardown()
    {
        driver.close();
    }

    @BeforeTest
    public void InitalizeTest() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("greenkarturl"));
    }
}