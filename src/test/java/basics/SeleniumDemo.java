package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class SeleniumDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); //initiates a browser session

        driver.get("https://www.duotech.io");


        String expected = "Software QA Automation Engineer program | SDET | QA School | Software Testing";
        String actualTitle = driver.getTitle();

//        if (actualTitle.equalsIgnoreCase(expected)){
//            System.out.println("Test Passed");
//        }else {
//            System.out.println("Test Failed");
//            System.out.println("EXPECTED: "+expected);
//            System.out.println("ACTUAL: "+ actualTitle);
//        }


        Assert.assertEquals(actualTitle,expected);

        driver.quit();

    }

}
