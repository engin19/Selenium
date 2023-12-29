package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWLocators {

        public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://fb.com");
            WebElement email=driver.findElement(By.name("email"));
            email.sendKeys("abc@gmail.com");
            WebElement password=driver.findElement(By.name("pass"));
            password.sendKeys("abc123");
            WebElement create=driver.findElement(By.partialLinkText("Create"));
            create.click();
            Thread.sleep(2000);
            WebElement firstName=driver.findElement(By.name("firstname"));

            firstName.sendKeys("Engin");
            WebElement lastName=driver.findElement(By.name("lastname"));
            lastName.sendKeys("Ozdemir");
            WebElement mobileNumber=driver.findElement(By.name("reg_email__"));
            mobileNumber.sendKeys("abcd@gmail.com");
            WebElement newpassword=driver.findElement(By.id("password_step_input"));
            newpassword.sendKeys("abcd123654");
            driver.close();



        }

    }

