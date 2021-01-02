package com.crystalKeyHotels.tests;

import com.crystalKeyHotels.utilities.ConfigReader;
import com.crystalKeyHotels.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GG_005RoomCreation {


    @Test
    public void positiveTest() throws InterruptedException {
        GG_005RoomCreation roomCreation = new GG_005RoomCreation();
        roomCreation.login();
        roomCreation.addHotelGiris();
        //IDHotel dropdown’ına tıklayın ve bir otel secin....Cizgi Dusler Hotel
        roomCreation.idHotel.click();
        Thread.sleep(5000);
        Select select = new Select(roomCreation.idHotel);
        select.selectByValue("1027");
        // Code text box’ına rakamlardan olusan sayı girin..3900.
        roomCreation.codeTextBox.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(roomCreation.codeTextBox)
                .sendKeys("code_textBox")
                .sendKeys(Keys.TAB)
                // Name text box’ına bir isim girin.....Double
                .sendKeys(ConfigReader.getProperty("nameTextBox"))
                .sendKeys(Keys.TAB)
                // Location text box’ına ülke ismi girin.... Italy
                .sendKeys(ConfigReader.getProperty("LocationTextBox"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        // Description bolumune bir yazı yazın
        // Price textBox’ına rakamlardan olusan bir miktar girin....700
        roomCreation.priceTextBox.sendKeys(ConfigReader.getProperty("PriceTextBox"));
        roomCreation.priceTextBox.click();
        // Room Type dropdown’ından bir roomType secin.... Queen
        roomCreation.roomTypeDropDown.click();
        Select select1 = new Select(roomCreation.roomTypeDropDown);
        select1.selectByValue("318");
        // Max Adult TextBox’ına bir sayı girin.....1
        roomCreation.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("MaxAdultTextBox"));
        //Max Children TextBox’ına bir sayı girin...0
        roomCreation.maxChildCountTextBox.sendKeys(ConfigReader.getProperty("MaxChildrenTextBox"));
        // Approved check box’ı isaretleyin
        roomCreation.isAvaible.click();
        // Save butonu tıklayın
        roomCreation.saveBotuno.click();
        //  Görüntülenen “HotelRoom was inserted successfully” yazısını onayla
        Thread.sleep(5000);
        Assert.assertEquals(roomCreation.sonucYazisi.getText(),"HotelRoom was inserted successfully");
        //Assert.assertTrue(roomCreation.sonucYazisi.isDisplayed());
        //ok butonuna basınız
        roomCreation.okButonu.click();



    }



}








