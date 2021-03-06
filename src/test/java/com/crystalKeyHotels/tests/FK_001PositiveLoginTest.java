package com.crystalKeyHotels.tests;

import com.crystalKeyHotels.pages.FK_CkHotelsHomePage;
import com.crystalKeyHotels.utilities.ConfigReader;
import com.crystalKeyHotels.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FK_001PositiveLoginTest {


    @Test
    public void pozitifSmokeTest(){
        FK_CkHotelsHomePage ckHotelsHomePage=new FK_CkHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        ckHotelsHomePage.ilkLogIn.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("ck_hotels_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("ck_hotel_password"));
        ckHotelsHomePage.loginButonu.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty("ck_title_basarili")));
        Driver.closeDriver();
    }

}





