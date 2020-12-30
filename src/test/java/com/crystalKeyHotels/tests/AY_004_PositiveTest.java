package com.crystalKeyHotels.tests;

import com.crystalKeyHotels.pages.AY_004_Page;
import com.crystalKeyHotels.utilities.ConfigReader;
import com.crystalKeyHotels.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AY_004_PositiveTest {

    @Test
    public void positiveTestCese01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));

        AY_004_Page ay004Page = new AY_004_Page();

        ay004Page.ilkLogin.click();
        ay004Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        ay004Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        ay004Page.loginKayit.click();

        ay004Page.hotelManagementButton.click();
        ay004Page.hotelListButton.click();

        ay004Page.addHotelButton.click();
        ay004Page.codeTextBox.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        ay004Page.nameTextBox.sendKeys(ConfigReader.getProperty("nameCrysHotel"));
        ay004Page.addressTextBox.sendKeys(ConfigReader.getProperty("adressCrysHotel"));
        ay004Page.phoneTextBox.sendKeys(ConfigReader.getProperty("phoneCrysHotel"));
        ay004Page.emailTextBox.sendKeys(ConfigReader.getProperty("emailCrysHotel"));

        Select select = new Select(ay004Page.dropDown);
        select.selectByValue(ConfigReader.getProperty("visibleText"));

        ay004Page.saveButton.click();

        Thread.sleep(3000);
        Assert.assertTrue(ay004Page.messageText.getText().contains("successfully"));
        ay004Page.okButton.click();

    }
}
