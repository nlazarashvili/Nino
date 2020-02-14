package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PG1 {
    @Test
    public void LocateByName() throws InterruptedException {
        System.setProperty("webdriver.chromedriver" ,"C:\\Users\\ninini\\Selenium\\Webdrivers");
        WebDriver driver = new ChromeDriver();
        driver.get(" http://demo.guru99.com/test/newtours/ ");
        driver.findElement(By.name("userName")).sendKeys("username");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.name("submit")).submit();
        driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
        driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
        Thread.sleep(2000);



    }
}
