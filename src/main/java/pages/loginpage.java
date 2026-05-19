package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
    WebDriver driver;

    public loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSite() {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }

    public void clickNewMailLink() {
        WebElement link = driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']"));
        link.click();
    }
}
