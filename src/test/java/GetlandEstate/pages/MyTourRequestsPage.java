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








}