package Searchpage;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Customerpage {

        WebDriver driver;
        public Customerpage (WebDriver driver) {
            this.driver = driver;

        }

        public void SearchCustomer(String CustName) throws InterruptedException {
            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement Button= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-class=\"btnClass3\"]")));
            Button.click();


            WebElement Text= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type=\"text\"]")));
            Text.click();
            Text.sendKeys(CustName);
        }

        public void DeleteCustomer(int a) throws InterruptedException {
            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement Button= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-class=\"btnClass3\"]")));
            Button.click();
            Thread.sleep(2000);
            List<WebElement> delete = driver.findElements(By.xpath("//button[text()='Delete']"));
            Thread.sleep(2000);
            delete.get(a).click();

        }
}
