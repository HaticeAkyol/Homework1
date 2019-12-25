package tests.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase8 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //Step 1. Go to https://practice-cybertekschool.herokuapp.com
        driver.get("https://practice-cybertekschool.herokuapp.com");

        // 2. Click on “Registration Form”Step
        driver.findElement(By.linkText("Registration Form")).click();

        // 3. Enter “5711234354” into phone number input box.Step
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("5711234354");
        Thread.sleep(2000);

        // 4. Verify that warning message is displayed: “Phone format is not correct”

        WebElement Result = driver.findElement(By.cssSelector("small[data-bv-result='INVALID"));
        Result.isDisplayed();

        String ecpectedResult = "Phone format is not correct";
        String actualResult = Result.getText();

        if(actualResult.equals(ecpectedResult))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        driver.quit();
    }
}
