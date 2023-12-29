package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        //instiating the instance of crome driver.
        WebDriver driver=new ChromeDriver();
       //maximize the screen

        driver.get("https://google.com");
        driver.manage().window().fullscreen();
        // get the title
        String title=driver.getTitle();
        System.out.println("the title of the page is "+title);
        // get the url of the page
        String url=driver.getCurrentUrl();
        System.out.println("the url is "+url);
        Thread.sleep(2000);
        //to close the window
        driver.quit();

    }
}
