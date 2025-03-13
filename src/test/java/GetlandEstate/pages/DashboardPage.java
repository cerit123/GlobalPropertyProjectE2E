package GetlandEstate.pages;

import GetlandEstate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//span[text()='Reports']")
    public WebElement reports;


    @FindBy(xpath = "//span[text()='Tour Requests']")
    public WebElement tourRequests;


}
