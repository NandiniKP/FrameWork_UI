package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

    public WebDriver driver;
    public Loginpage(WebDriver driver)
    {
        this.driver=driver;
    }
    By Practiselogin= By.cssSelector("a[href*='practice-project']");

    public WebElement PractiseProject(){
        return driver.findElement(Practiselogin);
    }
    By name=By.id("name");
    public WebElement Name(){
        return driver.findElement(name);
    }
   By email= By.id("email");

    public WebElement Email(){
        return driver.findElement(email);
    }


    By Submit=By.id("form-submit");

    public WebElement SubmitBtn(){
        return driver.findElement(Submit);
    }
    By Confirmlogin=By.xpath("//h5[text()='OUR PROJECTS']");

    public WebElement ConfirmLogin(){
        return driver.findElement(Confirmlogin);
    }
}

