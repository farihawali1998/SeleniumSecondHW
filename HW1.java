package Homework02222023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.name("customer.firstName")).sendKeys("Fariha");

        driver.findElement(By.name("customer.lastName")).sendKeys("Wali");

        driver.findElement(By.id("customer.address.street")).sendKeys("1112 Leesburg Pike");

        driver.findElement(By.id("customer.address.city")).sendKeys("Alexandria");

        driver.findElement(By.id("customer.address.state")).sendKeys("VA");

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22311");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("578-291-2999");

        driver.findElement(By.id("customer.ssn")).sendKeys("392-2939-293");

        driver.findElement(By.id("customer.username")).sendKeys("FarihaWali");

        driver.findElement(By.id("customer.password")).sendKeys("Fari@1234");

        driver.findElement(By.id("repeatedPassword")).sendKeys("Fari@1234");

        driver.findElement(By.className("button")).click();

        driver.quit();


    }
}
