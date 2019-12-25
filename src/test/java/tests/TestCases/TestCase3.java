package tests.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //Step 1. Go to https://practice-cybertekschool.herokuapp.com
        driver.get("https://practice-cybertekschool.herokuapp.com");

        // 2. Click on “Multiple Buttons”Step
        driver.findElement(By.linkText("Multiple Buttons")).click();

        // 3. Click on “Button 1”Verify that result message is displayed: “Clicked on button one!”
        driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
        WebElement Result  =driver.findElement(By.id("result"));
               Result.isDisplayed();
               Thread.sleep(2000);

        String expectedResult = "Clicked on button one!";
        String actualresult = Result.getText();
        if(actualresult.equals((expectedResult)))
            System.out.println("test passed");
        else
            System.out.println("test failed");



        driver.quit();
    }
}