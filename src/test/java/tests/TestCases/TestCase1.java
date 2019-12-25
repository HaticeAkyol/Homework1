package tests.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //Step 1. Go to https://practice-cybertekschool.herokuapp.com
        driver.get("https://practice-cybertekschool.herokuapp.com");
        //Step 2. Click on “Sign Up For Mailing List”Step
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        // 3. Enter any valid nameStep
        driver.findElement(By.name("full_name")).sendKeys("Hatice Akyol");
        // 4. Enter any valid emailStep
        driver.findElement(By.name("email")).sendKeys("akyolhatice@gmail.com");
        // 5. Click on “Sign Up” button
        driver.findElement(By.name("wooden_spoon")).click();
        // Expected result: Following message should be displayed:
        // “Thank you for signing up. Click the button below to return to the home page.”
        String expectedResult = "Thank you for signing up. Click the button below to return to the home page.";
        String actualResult = driver.findElement(By.name("signup_message")).getText();
        if(expectedResult.equals(actualResult)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        // Home button should be displayed.
        driver.findElement(By.linkText("Home")).isDisplayed();

        driver.quit();

    }
}