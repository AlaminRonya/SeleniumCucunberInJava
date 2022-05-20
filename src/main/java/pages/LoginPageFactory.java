package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    private WebDriver driver;
    private String url;

    @FindBy(id = "name")
    private WebElement textUsername;
    @FindBy(id = "password")
    private WebElement textPassword;
    @FindBy(id = "login")
    private WebElement loginBtn;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void browserIsOpen(String url){
        this.url = url;
        driver.navigate().to(url);
    }


    public void enterUserName(String name){
        textUsername.sendKeys(name);
    }
    public void enterUserPassword(String password){
        textPassword.sendKeys(password);
    }

    public void loginBtn(){
        loginBtn.click();
    }
}
