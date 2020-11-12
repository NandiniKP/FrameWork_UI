package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    public WebDriver initializeDriver() throws IOException {
        Properties prop =new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\kakar\\IdeaProjects\\FrameWork_UI\\FrameWork_UI\\src\\main\\java\\Resources\\Data.properties");
        prop.load(fis);
        String browserName=prop.getProperty("browser");
        if(browserName.equals("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
             driver= new ChromeDriver();
        }
        else if(browserName.equals("Firefox")) {

        }
        else if(browserName.equals("IE"))
        {

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}