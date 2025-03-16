package GetlandEstate.pages;

import GetlandEstate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTourRequestsPage {

    public MyTourRequestsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//span[text()='My Tour Requests']")
    public WebElement myTourRequests;

    @FindBy(id="[id='react-aria5396957487-:rp:-tab-response']")
    public WebElement myResponses;

    @FindBy(id="[id='react-aria5396957487-:rp:-tab-response']")
    public WebElement myRequests;

    @FindBy(xpath = "(//span[text()='Property'])[2]")
    public WebElement responsesProperty;

    @FindBy(xpath = "(//span[text()='Property'])[1]")
    public WebElement requestsProperty;

    @FindBy(xpath = "(//span[text()='Owner'])[1]")
    public WebElement owner;

    @FindBy(xpath = "(//span[text()='Guest'])[1]")
    public WebElement guest;

    @FindBy(xpath = "(//span[text()='Status'])[1]")
    public WebElement statusRequests;

    @FindBy(xpath = "(//span[text()='Status'])[12]")
    public WebElement statusResponses;

    @FindBy(xpath = "(//span[text()='Tour Date'])[1]")
    public WebElement tourDate;

    @FindBy(xpath = "(//span[text()='Tour Time'])[1]")
    public WebElement tourTime;

    @FindBy(xpath = "(//span[text()='Action'])[1]")
    public WebElement actionRequests;

    @FindBy(xpath = "(//span[text()='Action'])[12]")
    public WebElement actionResponses;



    @FindBy(xpath = "(//button[@class='btn-link btn btn-primary'])[1]")
    public WebElement actionDeleteButton;  //ilk giris tum ilan

    @FindBy(xpath = "(//button[@class='btn-link btn btn-primary'])[2]")
    public WebElement actionUpdateButton;

    @FindBy(xpath = "(//button[@class='btn-link btn btn-primary'])[2]")
    public WebElement tourDateChoose;

    @FindBy(id = "tourTime")
    public WebElement timeBooking;



    @FindBy(xpath = "(//button[@class='btn-link btn btn-primary'])[2]")
    public WebElement tourTimeChoose;

    @FindBy(xpath = "//button[text()='BACK']")
    public WebElement backChoose;

    @FindBy(xpath = "//button[text()='UPDATE']")
    public WebElement updateChoose;  //MyTourRequestteki tarih ayarladigimiz yerde

    @FindBy(xpath = "(//button[@class='btn-link approve-button btn btn-primary'])[1]")
    public WebElement approveAction;

    @FindBy(xpath = "(//button[@class='btn-link decline-button btn btn-primary'])[1]")
    public WebElement declineAction;

    @FindBy(xpath = "//span[text()='Are you sure you want to accept the tour request?']")
    public WebElement popupMessageMyResponses;

    @FindBy(xpath = "//span[text()='Yes']")
    public WebElement popupActionYes;

    @FindBy(xpath = "//span[text()='No']")
    public WebElement popupActionNo;

    @FindBy(xpath = "//div[text()='TourRequest created successfully']")
    public WebElement tourRequestCreatedSuccessfully;



















}