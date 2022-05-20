package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePageFactory;
import pages.LoginPageFactory;
import utils.BaseConfig;

import java.io.IOException;

public class LoginPageFactoryStep {

    private BaseConfig baseConfig;

    private LoginPageFactory loginPageFactory;
    private HomePageFactory homePageFactory;
    private WebDriver driver = null;


    @Given("browser is open")
    public void browser_is_open() throws InterruptedException, IOException {
        this.baseConfig = new BaseConfig();
        driver = baseConfig.getDriver();
//        loginPage = new LoginPage(driver);
        loginPageFactory = new LoginPageFactory(driver);
        Thread.sleep(2000);
        loginPageFactory.browserIsOpen(baseConfig.getUrl());

//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        Thread.sleep(4000);
//        driver = baseConfig.getDriver();

        homePageFactory = new HomePageFactory(driver);



        System.out.println("browser is open");
    }

    @And("^user is on login page$")
    public void userIsOnLoginPage(){
//        loginPage.browserIsOpen(baseConfig.getUrl());
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^user enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String name, String password) throws InterruptedException {
        loginPageFactory.enterUserName(name);
        loginPageFactory.enterUserPassword(password);
        Thread.sleep(1000);

//        loginPage.enterUserName(name);
//        loginPage.enterUserPassword(password);
    }

    @And("^user clicks on login$")
    public void userClicksOnLogin() {
        loginPageFactory.loginBtn();
//        loginPage.loginBtn();
    }

    @Then("^user is navigated to the home page$")
    public void userIsNavigatedToTheHomePage() throws InterruptedException {
        homePageFactory.clickLogoutIsDisplayed();
    }
//    @BeforeClass
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//resources//chromedriver.exe");
//        driver = new ChromeDriver();
//
//
//    }
}
