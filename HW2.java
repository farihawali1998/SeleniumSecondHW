package Homework02222023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("Arsh");

        driver.findElement(By.name("lastname")).sendKeys("Wali");

        driver.findElement(By.name("reg_email__")).sendKeys("453-283-2839");

        driver.findElement(By.name("birthday_month")).sendKeys("August");

        driver.findElement(By.name("birthday_day")).sendKeys("18");

        driver.findElement(By.name("birthday_year")).sendKeys("1934");

        driver.findElement(By.className("_58mt")).click();

        driver.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();

        driver.close();

        driver.quit();
    }
}
