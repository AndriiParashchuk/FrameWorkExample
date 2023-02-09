package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpFirstPage extends BasePage{
    @FindBy(xpath = "//strong[contains(text(),'Title')]")
    WebElement title;

    @FindBy(id = "//select[@id ='title']")
    WebElement titleDropDown = driver.findElement(By.xpath("//select[@id ='title']"));

    public void verifySignUp1(){
        Assert.assertTrue("Sign up first page not displayed", title.isDisplayed());

    }
    public void enterData1(){

    }
}
