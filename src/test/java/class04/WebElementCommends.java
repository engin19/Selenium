package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommends {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //goto the ebay website
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");
        WebElement textBox=driver.findElement(By.xpath("//input[@id='textInput']"));
        textBox.clear();
        textBox.sendKeys("Welcome");
        //        check if the option 1 is selected
//        if no then select it
        WebElement option1 = driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option1']"));
//        check if the radio button is selected
        boolean stateofOp1 = option1.isSelected();
        if(!stateofOp1){
            option1.click();

        }
//to print out the state of option 1
        System.out.println("The state of radio button 1 is "+ option1.isSelected());
        //to check if the option is enabled or not enabled
        WebElement option2 = driver.findElement(By.xpath("//input[@value='option2']"));
//
        boolean enableStateofOp2 = option2.isEnabled();
        if(enableStateofOp2){
            System.out.println("option2 is enable and can be selected");
        }
        else{
            System.out.println("the option2 is not enabled and not clickable");
        }
// click
        WebElement option3 = driver.findElement(By.xpath("//input[@value='option3']"));
        boolean isDisplayedOp3 = option3.isDisplayed();
        if(isDisplayedOp3){
            System.out.println("the radio button option3 is displayed");
        }
        else{
            System.out.println("the radio button option3 is not displayed");
        }
//        get the text
        WebElement textMsg = driver.findElement(By.xpath("//div[@id='textElement']"));
        String text = textMsg.getText();
        System.out.println(text);

        //        get the attribute value and print on screen
        WebElement attribute = driver.findElement(By.xpath("//div[text()='inspect me to view my custom attribute!']"));

        String value = attribute.getAttribute("id");
        System.out.println(value);
        }
    }

