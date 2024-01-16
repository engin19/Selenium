package reviewWeek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1Task1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://ebay.com");
        WebElement dd = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        dd.sendKeys("Cell Phone");
        WebElement button=driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        button.click();
    }

}
