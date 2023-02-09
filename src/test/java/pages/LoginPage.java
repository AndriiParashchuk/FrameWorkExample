package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "submit")
    WebElement submitBtn;

    @FindBy(xpath = "//a[contains(text(),' Sign Up Here')]")
    WebElement signUpHereLink;


    public void enterValidLoginInfo(){
        usernameInput.sendKeys("test1@gmail.com");
        passwordInput.sendKeys("TestPass1234");
    }

    public void clickSignInBtn(){
        submitBtn.click();

    }
    public void clickSignUpHereBtn(){
        signUpHereLink.click();

    }
    public void verifyLoginPage(){
        Assert.assertTrue("Login page not visible", signUpHereLink.isDisplayed());
    }


}
