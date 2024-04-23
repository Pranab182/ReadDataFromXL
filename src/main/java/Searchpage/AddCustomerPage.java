package Searchpage;

import Core.BrowserHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.swing.*;
import java.time.Duration;
import java.util.List;


public class AddCustomerPage {

    WebDriver driver;
    public AddCustomerPage(WebDriver driver) {
        this.driver = driver;

    }
    public void AddCustomer(String Fname,String Lname,String Postcode ) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-class=\"btnClass1\"]")));
        button.click();

        WebElement Firstname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"First Name\"]")));
        Firstname.click();
        Firstname.sendKeys(Fname);

        WebElement Lastname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Last Name\"]")));
        Lastname.click();
        Lastname.sendKeys(Lname);

        WebElement postcode =driver.findElement(By.xpath("//input[@placeholder=\"Post Code\"]"));
        postcode.click();
        postcode.sendKeys(Postcode);

        WebElement Submit= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        Submit.click();

        driver.switchTo().alert().accept();
        }


    }

