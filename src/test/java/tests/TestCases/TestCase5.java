package tests.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //Step 1. Go to https://practice-cybertekschool.herokuapp.com
        driver.get("https://practice-cybertekschool.herokuapp.com");

        // 2. Click on “Registration Form”Step
        driver.findElement(By.linkText("Registration Form")).click();

        // 3. Enter “123” into last name input box.Step
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("123");
        Thread.sleep(1000);

        // 4. Verify that warning message is displayed: “The last name can only consist of alphabetical letters and dash”
        WebElement Result = driver.findElement(By.cssSelector("small[data-bv-result='INVALID'"));
        Result .isDisplayed();
        Thread.sleep(1000);

        String expectedResult = "The last name can only consist of alphabetical letters and dash";
        String actualresult = Result.getText();
        if(actualresult.equals(expectedResult))
            System.out.println("test passed");
        else
            System.out.println("test failed");




         driver.quit();
    }
}
