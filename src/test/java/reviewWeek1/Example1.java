package reviewWeek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //goto the facebook  website
        driver.get("https://fb.com");
        WebElement createNewAccount=driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        //send the name
       Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");


    }
}
