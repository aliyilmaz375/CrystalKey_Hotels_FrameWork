package com.crystalKeyHotels.tests;

import com.crystalKeyHotels.pages.GD_006PageSearchButton;
import com.crystalKeyHotels.utilities.ConfigReader;
import com.crystalKeyHotels.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GD_PositiveTest01 {

    @Test
    public void AllHeadsPositiveTest(){
        GD_006PageSearchButton hotelList =new GD_006PageSearchButton();
        //crystalkeyhotels sitesine girin
        //Sag ustteki Login butonuna tiklayin
        //username butonuna valid bir username girin
        //password butonuna valid password girin
        //login Butonuna tiklayin
        hotelList.login_();

        //Hotel management buttonuna tikayin
        //Hotel Rooms Buttonuna tıklayın
        hotelList.hotelRoom_Giris();

        //Id Hotel Text Box drowdown’ından bir hotel secin
        hotelList.getDropdown(hotelList.idHotelDropdown, ConfigReader.getProperty("ckHotel_hotelName"));

        //Code text Box’ına listelemek istediğiniz kodu girin
        hotelList.code_TextBox.sendKeys(ConfigReader.getProperty("ckHotel_code"));

        //Name Text Box’na bir kod girin
        hotelList.nameTextBox.sendKeys(ConfigReader.getProperty("ckHotel_name"));

        //Location Text Box’na bir kod girin
        hotelList.locationTextBox.sendKeys(ConfigReader.getProperty("ckHotel_location"));

        //Price Text Box’na bir deger girin
        hotelList.price_TextBox.sendKeys(ConfigReader.getProperty("ckHotel_price"));

        //IDGroupRoomType Drowdown’ından bir oda secin
        hotelList.getDropdown(hotelList.idGroupRoomTypeDropdown,ConfigReader.getProperty("ckHotel_roomType"));

        // isAvailable drowdown’ından bir seçenek secin
        hotelList.getDropdown(hotelList.isAvailableDropDown, ConfigReader.getProperty("ckHotel_isAvailable"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();

    }


    @Test
    public void codePositiveTest(){
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

        //Code Text Box’na bir kod girin
        hotelList.code_TextBox.sendKeys(ConfigReader.getProperty("ckHotel_code"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();

    }

    @Test
    public void idGroupRoomTypePositiveTest(){
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

        //IDGroupRoomType Drowdown’ından bir oda secin
        hotelList.getDropdown(hotelList.idGroupRoomTypeDropdown, ConfigReader.getProperty("ckHotel_roomType"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();
    }


    @Test
    public void idHotelCodeNameLocationPositiveTest(){
        GD_006PageSearchButton hotelList =new GD_006PageSearchButton();
        //crystalkeyhotels sitesine girin
        //Sag ustteki Login butonuna tiklayin
        //username butonuna valid bir username girin
        //password butonuna valid password girin
        //login Butonuna tiklayin
        hotelList.login_();

        //Hotel management buttonuna tikayin
        //Hotel Rooms Buttonuna tıklayın
        hotelList.hotelRoom_Giris();

        //Id Hotel Text Box drowdown’ından bir hotel secin
        hotelList.getDropdown(hotelList.idHotelDropdown, ConfigReader.getProperty("ckHotel_hotelName"));

        //Code text Box’ına listelemek istediğiniz kodu girin
        hotelList.code_TextBox.sendKeys(ConfigReader.getProperty("ckHotel_code"));

        //Name Text Box’na bir kod girin
        hotelList.nameTextBox.sendKeys(ConfigReader.getProperty("ckHotel_name"));

        //Location Text Box’na bir kod girin
        hotelList.locationTextBox.sendKeys(ConfigReader.getProperty("ckHotel_location"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();

    }


    @Test
    public void idHotelCodeNameLocationPriceIDGroupRoomTypePositiveTest(){
        GD_006PageSearchButton hotelList =new GD_006PageSearchButton();
        //crystalkeyhotels sitesine girin
        //Sag ustteki Login butonuna tiklayin
        //username butonuna valid bir username girin
        //password butonuna valid password girin
        //login Butonuna tiklayin
        hotelList.login_();

        //Hotel management buttonuna tikayin
        //Hotel Rooms Buttonuna tıklayın
        hotelList.hotelRoom_Giris();

        //Id Hotel Text Box drowdown’ından bir hotel secin
        hotelList.getDropdown(hotelList.idHotelDropdown, ConfigReader.getProperty("ckHotel_hotelName"));

        //Code text Box’ına listelemek istediğiniz kodu girin
        hotelList.code_TextBox.sendKeys(ConfigReader.getProperty("ckHotel_code"));

        //Name Text Box’na bir kod girin
        hotelList.nameTextBox.sendKeys(ConfigReader.getProperty("ckHotel_name"));

        //Location Text Box’na bir kod girin
        hotelList.locationTextBox.sendKeys(ConfigReader.getProperty("ckHotel_location"));

        //Price Text Box’na bir deger girin
        hotelList.price_TextBox.sendKeys(ConfigReader.getProperty("ckHotel_price"));

        //IDGroupRoomType Drowdown’ından bir oda secin
        hotelList.getDropdown(hotelList.idGroupRoomTypeDropdown,ConfigReader.getProperty("ckHotel_roomType"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();

    }


    @Test
    public void idHotelCodeNameLocationPricePositiveTest(){
        GD_006PageSearchButton hotelList =new GD_006PageSearchButton();
        //crystalkeyhotels sitesine girin
        //Sag ustteki Login butonuna tiklayin
        //username butonuna valid bir username girin
        //password butonuna valid password girin
        //login Butonuna tiklayin
        hotelList.login_();

        //Hotel management buttonuna tikayin
        //Hotel Rooms Buttonuna tıklayın
        hotelList.hotelRoom_Giris();

        //Id Hotel Text Box drowdown’ından bir hotel secin
        hotelList.getDropdown(hotelList.idHotelDropdown, ConfigReader.getProperty("ckHotel_hotelName"));

        //Code text Box’ına listelemek istediğiniz kodu girin
        hotelList.code_TextBox.sendKeys(ConfigReader.getProperty("ckHotel_code"));

        //Name Text Box’na bir kod girin
        hotelList.nameTextBox.sendKeys(ConfigReader.getProperty("ckHotel_name"));

        //Location Text Box’na bir kod girin
        hotelList.locationTextBox.sendKeys(ConfigReader.getProperty("ckHotel_location"));

        //Price Text Box’na bir deger girin
        hotelList.price_TextBox.sendKeys(ConfigReader.getProperty("ckHotel_price"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();

    }


    @Test
    public void idHotelCodeNamePositiveTest(){
        GD_006PageSearchButton hotelList =new GD_006PageSearchButton();
        //crystalkeyhotels sitesine girin
        //Sag ustteki Login butonuna tiklayin
        //username butonuna valid bir username girin
        //password butonuna valid password girin
        //login Butonuna tiklayin
        hotelList.login_();

        //Hotel management buttonuna tikayin
        //Hotel Rooms Buttonuna tıklayın
        hotelList.hotelRoom_Giris();

        //Id Hotel Text Box drowdown’ından bir hotel secin
        hotelList.getDropdown(hotelList.idHotelDropdown, ConfigReader.getProperty("ckHotel_hotelName"));

        //Code text Box’ına listelemek istediğiniz kodu girin
        hotelList.code_TextBox.sendKeys(ConfigReader.getProperty("ckHotel_code"));

        //Name Text Box’na bir kod girin
        hotelList.nameTextBox.sendKeys(ConfigReader.getProperty("ckHotel_name"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();

    }


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
        hotelList.getDropdown(hotelList.idHotelDropdown, ConfigReader.getProperty("ckHotel_hotelName"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();
    }


    @Test
    public void idHotelVeCodePositiveTest(){
        GD_006PageSearchButton hotelList =new GD_006PageSearchButton();
        //crystalkeyhotels sitesine girin
        //Sag ustteki Login butonuna tiklayin
        //username butonuna valid bir username girin
        //password butonuna valid password girin
        //login Butonuna tiklayin
        hotelList.login_();

        //Hotel management buttonuna tikayin
        //Hotel Rooms Buttonuna tıklayın
        hotelList.hotelRoom_Giris();

        //Id Hotel Text Box drowdown’ından bir hotel secin
        hotelList.getDropdown(hotelList.idHotelDropdown, ConfigReader.getProperty("ckHotel_hotelName"));

        //Code text Box’ına listelemek istediğiniz kodu girin
        hotelList.code_TextBox.sendKeys(ConfigReader.getProperty("ckHotel_code"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();

    }


    @Test
    public void isAvailableDropdownPositiveTest(){
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

        // isAvailable drowdown’ından bir seçenek secin
        hotelList.getDropdown(hotelList.isAvailableDropDown, ConfigReader.getProperty("ckHotel_isAvailable"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();
    }


    @Test
    public void locationPositiveTest(){
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

        //Location Text Box’na bir kod girin
        hotelList.locationTextBox.sendKeys(ConfigReader.getProperty("ckHotel_location"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();

    }


    @Test
    public void namePositiveTest(){
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

        //Name Text Box’na bir kod girin
        hotelList.nameTextBox.sendKeys(ConfigReader.getProperty("ckHotel_name"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();

    }


    @Test
    public void priceTextBoxPositiveTest(){
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

        //Price Text Box’na bir deger girin
        hotelList.price_TextBox.sendKeys(ConfigReader.getProperty("ckHotel_price"));

        //Search buttonununa basın
        hotelList.searchButton.click();

        //Liste data sonuc kısmının "Page" içerdiğini test et
        Assert.assertTrue(hotelList.dataSonucText().contains(ConfigReader.getProperty("ckHotel_listeSonucDataIcermesiIstenen")));
        Driver.closeDriver();

    }




}
