package com.crystalKeyHotels.tests;

import com.crystalKeyHotels.pages.GD_006PageSearchButton;
import com.crystalKeyHotels.utilities.ConfigReader;
import com.crystalKeyHotels.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GD_NegativeTest02 {

    @Test
    public void idHotelDropdownPositiveTest(){
        GD_006PageSearchButton hotelList =new GD_006PageSearchButton();

        //crystalkeyhotels sitesine girin
        //Sag ustteki Login butonuna tiklayin
        //username butonuna valid bir username girin
        //password butonuna valid password girin
        //login Butonuna tiklayin
        hotelList.login_();

        //Hotel management buttonuna tiklayin
        //Hotel Rooms Buttonuna tıklayın
        hotelList.hotelRoom_Giris();

        //Id Hotel Text Box drowdown’ından bir hotel secin
        hotelList.getDropdown(hotelList.idHotelDropdown, ConfigReader.getProperty("ckHotel_hotelNameOdasiBulunmayan"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertEquals(hotelList.sonucBulunamadiText(),"No data available in table");
        Driver.closeDriver();
    }
}
