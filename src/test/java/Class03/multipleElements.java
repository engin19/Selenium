package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class multipleElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //goto the ebay website
        driver.get("https://ebay.com");
        // get all the links from ebay.com and print
        //  a tag= anchor tag
       List< WebElement> allLinks=driver.findElements(By.tagName("a"));
       for (WebElement link:allLinks){
           //extract the text from the WebElement
           String text=link.getText();
           System.out.println(text);
           //extract the link from the webElement
          String linkAddress= link.getAttribute("href");
           System.out.println(linkAddress);
       }


    }
}
