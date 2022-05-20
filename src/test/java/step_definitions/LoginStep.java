package step_definitions;

import exceptions.LoginPageNoSuchElementException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseConfig;

import java.io.IOException;

public class LoginStep{



//    private WebDriver driver;
//    private String url;


//    private BaseConfig baseConfig;
//    private LoginPage loginPage;


//    private WebElement username = null;
//    private WebElement userPassword = null;
//    private WebElement loginBtn = null;
//    private WebElement logoutBtn = null;


//    @Given("browser is open")
//    public void browser_is_open() throws InterruptedException, IOException {
//        this.baseConfig = new BaseConfig();
//        loginPage = new LoginPage(baseConfig.getDriver());
//        Thread.sleep(2000);
//        loginPage.browserIsOpen(baseConfig.getUrl());
//
//        System.out.println("browser is open");
//    }
//
//    @And("^user is on login page$")
//    public void userIsOnLoginPage(){
//        loginPage.browserIsOpen(baseConfig.getUrl());
//
//
//
////        driver.navigate().to(url);
////        this.username = getWebElementById("name");
////        this.userPassword = getWebElementById("password");
//
//
////        if (driver.findElement(By.cssSelector("#name1"))== null){
////            throw new LoginPageNoSuchElementException("name exception");
////        }else {
////            this.username = getWebElementById("name");
////
////        try {
////            if (getWebElementById("name1")==null){
////                throw new LoginPageNoSuchElementException("name exception");
////            }
////            this.username = getWebElementById("name");
////
////        }catch (LoginPageNoSuchElementException e){
////            System.out.println("e.getLocalizedMessage()================>"+e.id);
////        }
//
//
//    }
//
//    @When("^user enters (.*) and (.*)")
//    public void userEntersUsernameAndPassword(String name, String password) {
////        if (username == null || userPassword == null){
////            return;
////        }
//        loginPage.enterUserName(name);
//        loginPage.enterUserPassword(password);
//    }
//
//    @And("^user clicks on login$")
//    public void userClicksOnLogin() {
////        this.loginBtn = getWebElementById("login");
////        if (loginBtn != null){
////            loginBtn.click();
////        }
//
//        loginPage.loginBtn();
//    }
//
//    @Then("^user is navigated to the home page$")
//    public void userIsNavigatedToTheHomePage() throws InterruptedException {
////        this.logoutBtn = getWebElementById("logout");
////        if (logoutBtn == null){
////            return;
////        }
////        logoutBtn.isDisplayed();
////        Thread.sleep(4000);
////        driver.close();
////        driver.quit();
//        loginPage.driverClosed();
//
//    }
//    private WebElement getWebElementById(String id){
//        return driver.findElement(By.id(id));
//    }




}
