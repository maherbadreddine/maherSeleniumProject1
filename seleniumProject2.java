package SLM.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumProject2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        //go to https://www.google.com/.......................................1
        driver.get("https://www.google.com/");

        //maximize the screen
        driver.manage().window().maximize();

        //print the title.....................................................2
        String title= driver.getTitle();
        System.out.println("the page title is: " +title);

        //navigates `https://www.syntaxprojects.com/`+ print the page title...3
        driver.get("https://www.syntaxprojects.com/");

        //print the page title
        String title2 = driver.getTitle();
        System.out.println("the page title is: " + title2);

        //navigates back to `www.google.com`..................................4
        driver.navigate().back();

        //refresh the page `www.google.com`..................................5
        driver.navigate().refresh();

        //close all browser..................................................6
        Thread.sleep(2000);
        driver.close();


    }
}
