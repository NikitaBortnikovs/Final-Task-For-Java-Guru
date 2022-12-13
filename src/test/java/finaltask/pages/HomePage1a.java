package finaltask.pages;

import finaltask.core.BasePage1a;
import org.openqa.selenium.By;

public class HomePage1a extends BasePage1a {


    private static final String baseUrll = "https://www.1a.lv/";
    public void openBaseUrll() {
        startDriver();
        driver.get(baseUrll);
    }

    private final By searchBar = By.cssSelector("input[placeholder*='atrast']");
    private final By subButt = By.cssSelector("i[class^='main-search-submit']");
    private final By prodLink = By.xpath("//span[text()='Apple']");
    private  final By clickOnProd = By.xpath("//a[text()='Mobilais telefons Apple iPhone 11 Pro Max, pelēka, 4GB/256GB']");
    private final By acceptCookies = By.cssSelector("a[class='c-button']");
    private final By prodCatButt = By.xpath("//a[@class='main-menu__handle']");
    private final By categoryPhones = By.xpath("//li[@class='submenu-lvl1__list-item color-theme-22 submenu-lvl1__list-item--has-child']/a[1]");

    private final By subCategoryPhones = By.xpath("//img[@title ='Telefoni, viedpulksteņi']");
    private final By subSubCatPhones = By.cssSelector("img[alt='Mobilie telefoni, viedtālruņi']");
    private final By cookieButt = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");


    public  void clickOnProdCatBut (){driver.findElement(prodCatButt).click();}
    public  void clickOnCatPhones () {driver.findElement(categoryPhones).click();}
    public  void clickOnSubCatPhones() {driver.findElement(subCategoryPhones).click();}
    public void clickOnSubSubCatPhones (){driver.findElement(subSubCatPhones).click();}
    public void searchForProd(String prodName){
            driver.findElement(searchBar).sendKeys(prodName);
    }
    public  void  clickSubButt (){
        driver.findElement(subButt).click();
    }
    public void clickOnProduct () {
        driver.findElement(prodLink).click();
}
    public void clickOnIphone () {driver.findElement(clickOnProd).click();}

    public void clickAcceptCookies (){driver.findElement(acceptCookies).click();}




    }
