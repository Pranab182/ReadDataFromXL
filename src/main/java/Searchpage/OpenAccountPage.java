package Searchpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenAccountPage {
    WebDriver driver;
    public OpenAccountPage (WebDriver driver) {
        this.driver = driver;

    }

    public void OpenAccount(String CusName,String Currency) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement Button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-class=\"btnClass2\"]")));
        Button.click();
        WebElement Account =wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userSelect")));
        Select dropAccount = new Select(Account);
        dropAccount.selectByVisibleText(CusName);

        Select dropCurrency = new Select(driver.findElement(By.name("currency")));
        dropCurrency.selectByVisibleText(Currency);
        driver.findElement(By.xpath("//button[@type=\"submit\" or @value=\"Process\"]")).click();
        driver.switchTo().alert().accept();

        WebElement Button2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-class=\"btnClass3\"]")));
        Button2.click();
    }
}
