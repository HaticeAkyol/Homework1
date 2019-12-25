package tests.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase7 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //Step 1. Go to https://practice-cybertekschool.herokuapp.com
        driver.get("https://practice-cybertekschool.herokuapp.com");

        // 2. Click on “Registration Form”Step
        driver.findElement(By.linkText("Registration Form")).click();

        // 3. Enter “testers@email” into email input box.Step
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("testers@email");
        Thread.sleep(2000);

        // 4. Verify that warning message is displayed: “email address is not a validEmail format is not correct”

        WebElement Result = driver.findElement(By.cssSelector("small[data-bv-result='INVALID"));
        Result.isDisplayed();

        String ecpectedResult = "email address is not a validEmail format is not correct";
        String actualResult = Result.getText();

        if(actualResult.equals(ecpectedResult))
            System.out.println("test passed");
        else
            System.out.println("test failed");
       // driver.quit();
    }
}
