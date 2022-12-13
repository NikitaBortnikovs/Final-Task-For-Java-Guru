package finaltask.pages;


import org.openqa.selenium.By;

public class CartPage1a extends HomePage1a {

    private final By inCartButt = By.cssSelector("button[id*='cart']");
    private  final  By submitAndGoToCart = By.cssSelector("a[class='main-button']");
    private final By buyButt = By.cssSelector("input[class*='cart-main-button--large']");

    private final By enterEmailField = By.xpath("//input[@name='user[email]'][position()=1]");
    //private final By enterEmailField = By.xpath("//input[@class='users-session-form__input users-session-form__input--text'][position()=1]");
   private final By enterPassword = By.id("user_password");
    private final By submitButt = By.cssSelector("input[data-disable-with='Pievienoties']");
    private  final By deviveryOption = By.xpath("//input[@value='2']");
    private  final By deviveryOptionRiga = By.xpath("//input[@value='3210']");
    private final  By fillingNameField = By.xpath("//input[@name='address[first_name]']");
    private final  By fillingSurnameField = By.xpath("//input[@name='address[last_name]']");
    private final  By fillingPhoneField = By.xpath("//input[@name='address[phone_number]']");
    private final By submitButtFinal = By.xpath("//button[@data-disable-with='Lūdzu, uzgaidiet...']");



    public void clickOnCartButt () {driver.findElement(inCartButt).click();}
    public void  clickOnSubmitAndGoToCart () {driver.findElement(submitAndGoToCart).click();}
    public void clickOnBuyButt (){driver.findElement(buyButt).click();}
    public void clickOnEmailField (String keys) {driver.findElement(enterEmailField).sendKeys(keys);}
    public void clickOnPasswordField (String pass) {driver.findElement(enterPassword).sendKeys(pass);}
    public void clickOnSubmitBut (){driver.findElement(submitButt).click();}
    //public  void  clickOnDeliveryOption () {driver.findElement(deviveryOption).click();}
    public  void  clickOnDeliveryOptionRiga () {driver.findElement(deviveryOptionRiga).click();}
    public void clickOnNameBox (String name){driver.findElement(fillingNameField).sendKeys(name);}
    public void clickOnSurnameBox (String surname){driver.findElement(fillingSurnameField).sendKeys(surname);}
    public void clickOnPhoneBox (String phone){driver.findElement(fillingPhoneField).sendKeys(phone);}
    public void  clickOnFinalSubmitBitt (){driver.findElement(submitButtFinal).click();}


}
