package tests.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //Step 1. Go to https://practice-cybertekschool.herokuapp.com
        driver.get("https://practice-cybertekschool.herokuapp.com");

        // 2. Verify that number of listed examples is equals to 48.
        List<WebElement> listOfExamples = driver.findElements(By.className("list-group-item"));
        System.out.println("size: "+ listOfExamples.size());

        int expectedSize = 48;
        int actualsize = listOfExamples.size();
        if(expectedSize == actualsize){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }


        driver.quit();


    }

}
