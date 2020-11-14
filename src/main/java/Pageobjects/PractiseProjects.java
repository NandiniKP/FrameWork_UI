package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PractiseProjects {
    public WebDriver  driver;
    public PractiseProjects(WebDriver driver){
        this.driver=driver;
    }

    By ValidationText=By.xpath("//h5[@class='section-title h1']");

    By AutomationProject1=By.xpath("//*[@id='project-container']/div/div[1]/a[1]");

    By Greenkartlogo =By.xpath("//div[@class='brand greenLogo']");

    public WebElement ValidationText()
    {
        return driver.findElement(ValidationText);

    }
    public WebElement AutomationProject1()
    {
        return driver.findElement(AutomationProject1);

    }
    public WebElement Greenkartlogo()
    {
        return driver.findElement(Greenkartlogo);

    }
}

