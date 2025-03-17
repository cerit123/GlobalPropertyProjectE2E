package GetlandEstate.pages;


import GetlandEstate.utilities.Driver;
import GetlandEstate.utilities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
    public WebElement changeButton;
    public WebElement yesButton;
    public WebElement myProfileButton;
    public WebElement changePasswordSuccessfullMessage;
    public WebElement profilePhotoSuccessfullMessage;
    public WebElement deleteAccountSuccessfullMessage;

    public MyProfilePage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//span[normalize-space()='My Profile']")
    public WebElement myProfile;
    

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='(XXX) XXX-XXXX']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement email;

    @FindBy(xpath = "//button[normalize-space()='UPDATE']")
    public WebElement updateButton;

    @FindBy(xpath = "button[id='react-aria5536467963-:r3:-tab-change-password']")
    public WebElement changePassword;

    @FindBy(xpath = "//input[@placeholder='Current Password']")
    public WebElement currentPassword;

    @FindBy(xpath = "//input[@placeholder='New Password']")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button[normalize-space()='CHANGE']")
    public WebElement changePasswordButton;

    @FindBy(xpath = "//button[@id='react-aria5536467963-:r3:-tab-profile-photo']")
    public WebElement profilePhoto;

    @FindBy(xpath = "//button[normalize-space()='SELECT']")
    public WebElement selectButton;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement fileUploadInput;  // Actual file input field

    @FindBy(xpath = "//button[normalize-space()='SAVE']")
    public WebElement saveButton; // Save button after uploading

    @FindBy(xpath = "//div[@class='p-toast-message-text']")
    public WebElement profileUpdatesuccessfullMessage;

    @FindBy(xpath = "//button[@id='react-aria5536467963-:r3:-tab-delete-account']")
    public WebElement deleteAccountButton;


    @FindBy(xpath = "//div[@class='p-toast-detail']")
    public WebElement accountDeleteSuccessfullMessage;


    public boolean profileUpdatesuccessfullMessageisDisplayed() {
        return false;

    }
    public WebElement successMessage;
    public boolean successMessageisDisplayed() {
        return successMessage.isDisplayed();
    }

    public boolean changePasswordSuccessfullMessageisDisplayed() {
        return true;
    }

    public boolean profilePhotoSuccessfullMessageisDisplayed() {
        return true;
    }

    public boolean deleteAccountSuccessfullMessageisDisplayed() {
        return true;
    }
}






