package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpSecondPage extends BasePage{

    @FindBy(xpath = "//strong[contains(text(),'Address')]")
    WebElement address;

    public void verifySignUp2(){
        Assert.assertTrue("Sign up second page not visible", address.isDisplayed());


    }

}
