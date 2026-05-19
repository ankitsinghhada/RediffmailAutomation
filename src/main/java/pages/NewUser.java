package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewUser {
	WebDriver driver;

    public NewUser(WebDriver driver) {
        this.driver = driver;
    }

    public void fullName(String fname) {
        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Enter your full name']"));
        fullName.sendKeys(fname);
    }

    public void checkEmail(String email) {
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Enter Rediffmail ID']"));
        emailField.sendKeys("Kamal123");
    }

    public void CheckAvailability() {
        driver.findElement(By.xpath("//input[@value='Check availability']")).click();
    }

    public void selectRadio() {
        driver.findElement(By.xpath("//*[@id='radio_login']")).click();
    }

    public void checkPassword(String password) {
        driver.findElement(By.xpath("//*[@id='newpasswd']")).sendKeys(password);
    }

    public void Sday(String day) {
        new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"))).selectByVisibleText(day);
    }

    public void nMonth(String month) {
        new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"))).selectByVisibleText("JUN");
    }

    public void nYear(String year) {
        new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"))).selectByVisibleText("2000");
    }

    public void nCountry(String expectedCountry) {
        Select countryDropdown = new Select(driver.findElement(By.id("country")));
        List<WebElement> countries = countryDropdown.getOptions();

        System.out.println("Available countries:");
        for (WebElement country : countries) {
            System.out.println(country.getText());
        }

        System.out.println("Total countries: " + countries.size());

        countryDropdown.selectByVisibleText(expectedCountry);
        String selected = countryDropdown.getFirstSelectedOption().getText();
        System.out.println("Selected country: " + selected);

        if (selected.equals(expectedCountry)) {
            System.out.println("Country validated successfully.");
        } else {
            System.out.println("Country validation failed.");
        }
    }

	public void checkRetypePass(String password) {
        driver.findElement(By.xpath("//*[@id='newpasswd1']")).sendKeys(password);
	}
}
