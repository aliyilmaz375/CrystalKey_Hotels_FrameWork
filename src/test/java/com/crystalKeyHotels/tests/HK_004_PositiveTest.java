package com.crystalKeyHotels.tests;


import com.crystalKeyHotels.pages.HK_004_Page;
import com.crystalKeyHotels.utilities.ConfigReader;
import com.crystalKeyHotels.utilities.Driver;
import com.crystalKeyHotels.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HK_004_PositiveTest {

    @Test

    public void positiveTestCase01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));


        HK_004_Page hk004Page = new HK_004_Page();
        hk004Page.ilkLogin.click();
        hk004Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        hk004Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        hk004Page.loginKayit.click();
        hk004Page.hotelManagementButton.click();
        hk004Page.hotelListButton.click();
        hk004Page.codeButton.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        hk004Page.searchButton.click();
        Thread.sleep(4000);
        hk004Page.detailButton.click();
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        Thread.sleep(4000);
        hk004Page.codeButton.clear();
        hk004Page.codeButton.sendKeys(ConfigReader.getProperty("codeCrysHotel2"));
        Thread.sleep(4000);
        hk004Page.saveButton.click();

        Thread.sleep(4000);
        Assert.assertTrue(hk004Page.messageText.isDisplayed());
        hk004Page.okButton.click();

    }
    @Test

    public void positiveTestCase02() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));


        HK_004_Page hk004Page = new HK_004_Page();
        hk004Page.ilkLogin.click();
        hk004Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        hk004Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        hk004Page.loginKayit.click();
        hk004Page.hotelManagementButton.click();
        hk004Page.hotelListButton.click();
        hk004Page.codeButton.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        hk004Page.searchButton.click();
        Thread.sleep(4000);
        hk004Page.detailButton.click();
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        Thread.sleep(4000);
        hk004Page.nameButton.clear();
        hk004Page.nameButton.sendKeys(ConfigReader.getProperty("newnamecryshotel"));
        hk004Page.newAdresTextBox.clear();
        hk004Page.newAdresTextBox.sendKeys(ConfigReader.getProperty("newadrescryshotel"));

        Thread.sleep(4000);
        hk004Page.saveButton.click();

        Thread.sleep(4000);
        Assert.assertTrue(hk004Page.messageText.isDisplayed());
        hk004Page.okButton.click();

    }
}
