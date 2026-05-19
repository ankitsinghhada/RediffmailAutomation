package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.NewUser;
import pages.loginpage;
import utils.ExcelUtils;

public class redifTest extends BaseTest {

    @Test
    public void testSignUp() throws InterruptedException {
        String filePath = System.getProperty("user.dir") + "\\tests\\data.xlsx";
        String fname = ExcelUtils.getCellValue(filePath, 1, 2);
        String email = ExcelUtils.getCellValue(filePath, 1, 3);
        String password = ExcelUtils.getCellValue(filePath, 1, 4);
        String day = ExcelUtils.getCellValue(filePath, 1, 5);
        String month = ExcelUtils.getCellValue(filePath, 1, 6);
        String year = ExcelUtils.getCellValue(filePath, 1, 7);
        String country = ExcelUtils.getCellValue(filePath, 1, 8);

        loginpage home = new loginpage(driver);
        NewUser susu = new NewUser(driver);

        home.navigateToSite();
        home.clickNewMailLink();

        susu.fullName(fname);
        Thread.sleep(2000);
        susu.checkEmail(email);
        susu.CheckAvailability();
        Thread.sleep(2000);
        susu.selectRadio();
        susu.checkPassword(password);
        susu.checkRetypePass(password);
        susu.Sday(day);
        Thread.sleep(2000);
        susu.nMonth(month);
        Thread.sleep(2000);
        susu.nYear(year);
        Thread.sleep(2000); 
        susu.nCountry(country);
        Thread.sleep(5000);
    }
}
