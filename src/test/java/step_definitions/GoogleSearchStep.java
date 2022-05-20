package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.BaseConfig;

import java.io.IOException;

public class GoogleSearchStep {
//    private WebDriver driver;
//    private BaseConfig baseConfig;
//    @Given("browser is open")
//    public void browserIsOpen() throws IOException, InterruptedException {
//        baseConfig = new BaseConfig();
//        this.driver = baseConfig.getDriver();
//    }
//
//    @And("user is on google search page")
//    public void userIsOnGoogleSearchPage() throws InterruptedException {
//        driver.navigate().to(baseConfig.getUrl());
//        Thread.sleep(1000);
//    }
//
//    @When("user enters a text in search box")
//    public void userEntersATextInSearchBox() {
//        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//    }
//
//    @And("hits enter")
//    public void hitsEnter() {
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//    }
//
//    @Then("user is navigated to search results")
//    public void userIsNavigatedToSearchResults() throws InterruptedException {
//        driver.getPageSource().contains("Online Courses");
//        Thread.sleep(4000);
//        driver.close();
//        driver.quit();
//    }
}
