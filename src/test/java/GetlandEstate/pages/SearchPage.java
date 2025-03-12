package GetlandEstate.pages;

import GetlandEstate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//button[text()='Rent']")
    public WebElement rentButton;

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





}
