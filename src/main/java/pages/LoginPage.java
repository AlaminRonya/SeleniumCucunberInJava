package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private String url;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void browserIsOpen(String url){
        this.url = url;
        driver.navigate().to(url);
    }


    public void enterUserName(String name){
        driver.findElement(By.id("name")).sendKeys(name);
    }
    public void enterUserPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void loginBtn(){
        driver.findElement(By.id("login")).click();
    }
    public void driverClosed() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
        driver.quit();
    }







}
