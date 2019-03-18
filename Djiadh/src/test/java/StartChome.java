import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.bind.Element;
import java.net.MalformedURLException;
import java.net.URL;



public class StartChome {
    private static ChromeDriver driver;
     @BeforeMethod
    public static void chome(){
System.setProperty("webdriver.chrome.driver","D:\\jiadh\\IdeaProjects\\Djiadh\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    @Test
    private static void fire() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver","D:\\jiadh\\IdeaProjects\\Djiadh\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public static void grid() throws InterruptedException, MalformedURLException {
        DesiredCapabilities chomeDC = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.2.105:4444/wd/hub"),chomeDC);
        driver.get("http://www.baidu.com");
        Thread.sleep(5000);
        driver.quit();

    }
    @Test
    public void DengLu(){
         driver.get("http://47.105.71.75/hdpanel/login");
        //Element element = (Element) driver.findElement(By.name("username"));


    }
}

