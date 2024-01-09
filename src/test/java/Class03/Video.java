package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fb.com");
        WebElement email=driver.findElement(By.id("email"));
//       sending the data to the WebElement
        email.sendKeys("abracadbra@gmail.com");

//       find the element password and send the password
        WebElement password = driver.findElement(By.name("pass"));

        password.sendKeys("hellooo123");

//        find the element button login
        WebElement login = driver.findElement(By.name("login"));
//        login.click();


//        goto button create new account and click on it
//        WebElement createAccount = driver.findElement(By.linkText("Create new account"));
//        createAccount.click();
        WebElement createAccount = driver.findElement(By.partialLinkText("Create "));
        createAccount.click();
         WebElement xpath=driver.findElement(By.xpath("//input[@class'firstname']"));
        xpath.sendKeys("Engin");
    }

}
