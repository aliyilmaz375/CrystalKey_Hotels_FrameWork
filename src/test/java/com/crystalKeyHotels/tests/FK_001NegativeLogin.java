package com.crystalKeyHotels.tests;

import com.crystalKeyHotels.pages.FK_CkHotelsHomePage;
import com.crystalKeyHotels.utilities.ConfigReader;
import com.crystalKeyHotels.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FK_001NegativeLogin {

    @Test
    public void yanlisusarname (){
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        FK_CkHotelsHomePage ckHotelsHomePage= new FK_CkHotelsHomePage();
        ckHotelsHomePage.ilkLogIn.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("ck_invalid_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("ck_hotel_password"));
        ckHotelsHomePage.loginButonu.click();
        Assert.assertTrue(ckHotelsHomePage.girilemediYazisi.isDisplayed());
        Driver.closeDriver();

    }


    @Test
    public void yanlisPassword(){
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        FK_CkHotelsHomePage ckHotelsHomePage= new FK_CkHotelsHomePage();
        ckHotelsHomePage.ilkLogIn.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("ck_hotels_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("ck_wrong_password"));
        ckHotelsHomePage.loginButonu.click();
        Assert.assertTrue(ckHotelsHomePage.girilemediYazisi.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void yanliskullaniciVeSifre(){

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        FK_CkHotelsHomePage ckHotelsHomePage= new FK_CkHotelsHomePage();
        ckHotelsHomePage.ilkLogIn.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("ck_invalid_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("ck_wrong_password"));
        ckHotelsHomePage.loginButonu.click();
        Assert.assertTrue(ckHotelsHomePage.girilemediYazisi.isDisplayed());

        Driver.closeDriver();



    }


}




