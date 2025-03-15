package GetlandEstate.pages;

import GetlandEstate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//button[text()='Rent']")
    public WebElement rentButton;

    @FindBy(xpath="//button[text()='Sale']")
    public WebElement saleButton;

    @FindBy(css="input[name='query']")
    public WebElement searchBox;

    @FindBy(xpath="(//button[@type='button'])[5]")
    public WebElement searchButton;

    @FindBy(xpath="//button[text()='HOUSE']")
    public WebElement houseButton;

    @FindBy(xpath="//button[text()='APARTMENT']")
    public WebElement apartmentButton;

    @FindBy(xpath="//button[text()='OFFICE']")
    public WebElement officeButton;

    @FindBy(xpath="//button[text()='VILLA']")
    public WebElement villaButton;

     @FindBy(xpath="//button[text()='LAND']")
    public WebElement landButton;

    @FindBy(xpath="//button[text()='SHOP']")
    public WebElement shopButton;

    @FindBy(xpath="//input[@id='q']")
    public WebElement searchBox2;

    @FindBy(xpath="//input[@id='ps']")
    public WebElement minPriceRange;

    @FindBy(xpath="//input[@id='pe']")
    public WebElement maxPriceRange;



    @FindBy(xpath="//select[@id='at']")
    public WebElement advertTypeDropDown;

    @FindBy(xpath="//select[@id='c']")
    public WebElement categoryDropDown;

    @FindBy(xpath="//select[@id='ctry']")
    public WebElement countryDropDown;

    @FindBy(xpath="//select[@id='city']")
    public WebElement cityDropDown;

    @FindBy(xpath="//select[@id='dist']")
    public WebElement districtDropDown;

    @FindBy(xpath="(//button[@type='button'])[3]")
    public WebElement searchButton2;


    @FindBy(xpath="//span[text()='Total found : ']")
    public WebElement totalFoundText;

    @FindBy(xpath="//span[text()='Error']")
    public WebElement errorMassage;

    @FindBy(css = "div.property-card.card")
    public List<WebElement> propertiesList;

    @FindBy(xpath="//img[@data-pc-section='image']")
    public WebElement image;

    @FindBy(xpath="//h4[text()='Description']")
    public WebElement Description;

    @FindBy(xpath="//h4[text()='DETAILS']")
    public WebElement Details;

    @FindBy(xpath="//h4[text()='LOCATION']")
    public WebElement Location;


    //yordun be github



}
