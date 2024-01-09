package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto fb.com
        driver.get("https://syntaxprojects.com/Xpath.php");
        //finding the input box username
       WebElement username= driver.findElement(By.xpath("//input[@id='title']"));
        username.sendKeys("abracadabra");

        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();
        //find the security question
        WebElement q1 = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        q1.sendKeys("what is your name?");
        WebElement textMsg = driver.findElement(By.xpath("//label[contains(text(),' Lorem ipsum')]"));
        String text = textMsg.getText();
        System.out.println(text);
        WebElement api= driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        api.sendKeys("123.125.1256");
        //send the email 2
      WebElement email2= driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
      email2.sendKeys("abc@gmail.com");
      //send the field 2
      WebElement field2=driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
      field2.sendKeys("abcdfr");
      // send the field1
      WebElement field1= driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='one']"));
      field1.sendKeys("erbhehje");
    }
}
