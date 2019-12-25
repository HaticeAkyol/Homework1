package tests.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //Step 1. Go to https://practice-cybertekschool.herokuapp.com
        driver.get("https://practice-cybertekschool.herokuapp.com");

        // 2. Click on “Registration Form”Step
        driver.findElement(By.linkText("Registration Form")).click();

        // 3. Enter “123” into first name input box.Step
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("123");

        // 4. Verify that warning message is displayed: “first name can only consist of alphabetical letters”
        WebElement Result = driver.findElement(By.cssSelector("small[data-bv-result='INVALID'"));
               Result .isDisplayed();
        Thread.sleep(1000);

        String expectedResult = "first name can only consist of alphabetical letters";
        String actualresult = Result.getText();
        if(actualresult.equals(expectedResult))
            System.out.println("test passed");
        else
            System.out.println("test failed");



        driver.quit();



    }
}