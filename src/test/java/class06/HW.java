package class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Thread.sleep(2000);
        Alert alertHandler = driver.switchTo().alert();
        alertHandler.accept();
        WebElement alert2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/button"));
        alert2.click();
        Alert alertHandler1 = driver.switchTo().alert();

        alertHandler1.accept();
        WebElement alert3 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/button"));
        alert3.click();
        Alert alertHandler2 = driver.switchTo().alert();
        alertHandler2.sendKeys("Engin Ozdemir");
        alertHandler2.accept();


    }
}
