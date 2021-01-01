package com.crystalKeyHotels.pages;

import com.crystalKeyHotels.utilities.ConfigReader;
import com.crystalKeyHotels.utilities.Driver;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.apache.poi.ss.usermodel .*;
import org.testng.Assert;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class GD_006PageSearchButton {

    public GD_006PageSearchButton(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Log in")
    public WebElement ilkLogin;


    @FindBy(id="UserName")
    public WebElement userNameTextBox;


    @FindBy(id = "Password")
    public WebElement pswTextBox;

    @FindBy(id="btnSubmit")
    public WebElement ikinciLogin;


    @FindBy(xpath = "//*[.='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRooms;

    @FindBy(id="lkpHotels")
    public WebElement idHotelDropdown;


    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchButton;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement code_TextBox;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement nameTextBox;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement locationTextBox;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement price_TextBox;

    @FindBy(id = "lkpGroupRoomTypes")
    public WebElement idGroupRoomTypeDropdown;

    @FindBy(xpath = "//select[@name='IsAvailable']")
    public WebElement isAvailableDropDown;

    @FindBy(xpath = "(//div[@class='pagination-panel'])[1]")
    public WebElement listeDataSonuc;


    public void login_(){

        GD_006PageSearchButton login_ =new GD_006PageSearchButton();

        // crystalkeyhotels sitesine girin
        Driver.getDriver().get(ConfigReader.getProperty("ckHotel_URL"));

        //Sag ustteki Login butonuna tiklayin
        login_.ilkLogin.click();

        //username butonuna valid bir username girin
        login_.userNameTextBox.sendKeys(ConfigReader.getProperty("ckHotel_validUserName"));

        //password butonuna valid password girin
        login_.pswTextBox.sendKeys(ConfigReader.getProperty("ckHotel_validPsw"));

        //login Butonuna tiklayin
        login_.ikinciLogin.click();

    }

    public void hotelRoom_Giris(){
        GD_006PageSearchButton hotelRoom_Giris =new GD_006PageSearchButton();
        //  Hotel management buttonuna tiklayin
        hotelRoom_Giris.hotelManagement.click();
        //  Hotel Rooms Buttonuna tıklayın
        hotelRoom_Giris.hotelRooms.click();
    }


    public void getDropdown(WebElement dropdown,String text){
        Select select =new Select(dropdown);
        select.selectByVisibleText(text);

    }


    public String dataSonucText(){
        GD_006PageSearchButton US006Page =new GD_006PageSearchButton();
        String dataSonucText = US006Page.listeDataSonuc.getText();
        return dataSonucText;
    }
}