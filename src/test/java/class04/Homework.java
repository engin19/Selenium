package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //goto the SyntaxProject website
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        //sending text to the first box of Following Sibling
        WebElement FolSiblingsBox1 =driver.findElement(By.xpath("//input[@id='favourite-book']"));
        FolSiblingsBox1.sendKeys("My name is Red");
        // sending text to Second Box of following Sibling
        WebElement FolSiblingsBox2=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        FolSiblingsBox2.sendKeys("One Hundred Years of Solitude");
  // sending text to first  Box of Preceding Sibling
        WebElement FolSiblingsBox3=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        FolSiblingsBox3.sendKeys("The Grapes of Wrath");



        // sending text to First Box of Preceding Sibling
        WebElement PreSiblingsBox1=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        PreSiblingsBox1.sendKeys("The Grapes of Wrath");
        // sending text to Second Box of Preceding Sibling
        WebElement PreSiblingsBox2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        PreSiblingsBox2.sendKeys("One Hundred Years of Solitude");
        // sending text to Third Box of Preceding Sibling
        WebElement PreSiblingsBox3=driver.findElement(By.xpath("//input[@id='least-favorite']"));
        PreSiblingsBox3.sendKeys("My name is Red");


        //Sending Text to first box of Parent Child Relationship
        WebElement ParChildBox1=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        ParChildBox1.sendKeys("GrandParent");
        //Sending Text to second box of Parent Child Relationship
        WebElement ParChildBox2=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        ParChildBox2.sendKeys("Parent");
        //Sending Text to third box of Parent Child Relationship
        WebElement ParChildBox3=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        ParChildBox3.sendKeys("Child ");

driver.close();





    }
}
