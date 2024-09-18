package SLM.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumProject3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("MAHER BADREDDINE");

        WebElement yourEmail = driver.findElement(By.name("yourEmail"));
        yourEmail.sendKeys("mhrbdrddn@gmail.com");

        WebElement ClintName = driver.findElement(By.name("ClientName"));
        ClintName.sendKeys("maher");

        WebElement ClientId = driver.findElement(By.id("ClientId"));
        ClientId.sendKeys("292434");

        WebElement Clientfeedback = driver.findElement(By.name("Clientfeedback"));
        Clientfeedback.sendKeys("GOOD");

        WebElement ProjectName = driver.findElement(By.id("ProjectNameId"));
        ProjectName.sendKeys("PRJ3");

        WebElement ProjectTime = driver.findElement(By.name("ProjectTime"));
        ProjectTime.sendKeys("120MN");

        WebElement CurrentAddress = driver.findElement(By.name("CurrentAddress"));
        CurrentAddress.sendKeys("STR 876 CA SAN DIEGO");

        WebElement PermanentAddress = driver.findElement(By.name("PermanentAddress"));
        PermanentAddress.sendKeys("STR 3545 CA SAN DIEGO");

        WebElement Submit = driver.findElement(By.name("btn-submit"));
        Submit.click();

        WebElement ClickHere=driver.findElement(By.linkText("Click Here."));
        ClickHere.click();

        WebDriver Driver;
        driver.quit();
















    }
}
