package finaltask.pages;

import finaltask.core.BasePage1a;
import org.openqa.selenium.By;

public class LogOutAfterTestPage extends BasePage1a {
    private final By clickLogo = By.xpath("//a[@class='main-logo main-logo--checkout']");
    private final By profileButt = By.xpath("//div[@class='user-block__title']");
    private  final  By deleteData = By.xpath("//a[@class='profile-address-list__icon-delete']");


    public void clickOnLogo (){driver.findElement(clickLogo).click();}
    public void clickOnProfileButt () {driver.findElement(profileButt).click();}
    public void clickOnDeleteDataBut () {driver.findElement(deleteData).click();}


}
