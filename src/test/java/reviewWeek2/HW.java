package reviewWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto gmail
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
//click on the button help and privacy
 WebElement userName=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
userName.sendKeys("Admin");
 WebElement password=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));

password.sendKeys("Hum@nhrm123");
WebElement click=driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
click.click();
        driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
     WebElement username1= driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userName\"]"));
     username1.click();

     Thread.sleep(2000);
 //WebElement username1= driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userName\"]"));
     username1.sendKeys("engin");
        WebElement search= driver.findElement(By.xpath("//*[@id=\"searchBtn\"]"));
        search.click();



    }
}
