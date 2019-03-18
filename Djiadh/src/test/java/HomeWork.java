import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.xml.bind.Element;
import java.util.List;

import static java.lang.Thread.*;

public class HomeWork {

    WebDriver driver;

    @BeforeTest

    public void chome() {
        System.setProperty("webdriver.chrome.driver", "D:\\jiadh\\IdeaProjects\\Djiadh\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void openChome() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","D:\\jiadh\\IdeaProjects\\Djiadh\\driver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        Dimension dimension = new Dimension(300, 600);
        driver.manage().window().setSize(dimension);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    // 打印出百度首页多少个input标签
    public void printtag() {
        System.setProperty("webdriver.chrome.driver", "D:\\jiadh\\IdeaProjects\\Djiadh\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        List<WebElement> list = driver.findElements(By.tagName("input"));
        System.out.println(list.size());
    }

    @Test
//打开百度首页，再点一下百度的“新闻”按钮
    public void news() throws InterruptedException {
    driver.get("http://www.baidu.com");

    WebElement  element = driver.findElement(By.xpath(".//*[@id=\"u_sp\"]/a[1]"));

    element.click();

    }
}

