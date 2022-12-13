package finaltask.steps;

import finaltask.models.ProductModel;
import finaltask.models.UserDataModel;
import finaltask.core.BasePage1a;
import finaltask.pages.CartPage1a;
import finaltask.pages.HomePage1a;
import finaltask.pages.LogOutAfterTestPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import static finaltask.core.BasePage1a.driver;


public class Steps {
    HomePage1a homePage1a = new HomePage1a();
    BasePage1a basePage1a= new BasePage1a();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions actions = new Actions(driver);
    ProductModel productModel = new ProductModel();
    CartPage1a cartPage1a = new CartPage1a();
    SoftAssert softAssert = new SoftAssert();
    UserDataModel userDataModel = new UserDataModel();

    LogOutAfterTestPage logOutAfterTestPage = new LogOutAfterTestPage();



    @Given("Open URL address")
    public void openURLAddress() {
        homePage1a.openBaseUrll();

    }

    @And("User accepts cookies")
    public void userAcceptsCookies() {
        homePage1a.clickAcceptCookies();
    }

    @When("User clicks on product category button")
    public void userClicksOnProductCategoryButton() {
        homePage1a.clickOnProdCatBut();
    }

    @And("Then user click on subcategory Phones")
    public void thenUserClickOnSubcategoryPhones() {
        homePage1a.clickOnCatPhones();
    }


    @And("User gives {int} sec sleep for page to load")
    public void userGivesSecSleepForPageToLoad(int arg0) throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("User maximises the screen")
    public void userMaximisesTheScreen() {
        driver.manage().window().maximize();
    }

    @And("Gives {int} sec more for page to laod")
    public void givesSecMoreForPageToLaod(int arg0) throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("User scroll down and gives {int} sec sleep to load the page")
    public void userScrollDownAndGivesSecSleepToLoadThePage(int arg0) throws InterruptedException {

        js.executeScript("window.scrollBy(0,400)", "");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,400)", "");
    }

    @When("User clicks on subsubcategory Phones")
    public void userClicksOnSubsubcategoryPhones() {
        homePage1a.clickOnSubCatPhones();
    }

    @And("User gives {int} sec to load the page and scroll down")
    public void userGivesSecToLoadThePageAndScrollDown(int arg0)throws InterruptedException {
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    @When("User finds another category Phones and click on it")
    public void userFindsAnotherCategoryPhonesAndClickOnIt() {
        homePage1a.clickOnSubSubCatPhones();
    }

    @And("On on this page user sees the list of phones and scroll up and down to see all available products")
    public void onOnThisPageUserSeesTheListOfPhonesAndScrollUpAndDownToSeeAllAvailableProducts() throws InterruptedException{
        Thread.sleep(2500);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1500);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2500);
        actions.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(1500);
        actions.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(2500);
    }

    @Then("User searches for a specific product in search bad")
    public void userSearchesForASpecificProductInSearchBad() {
        homePage1a.searchForProd(productModel.productNameForSearching);
    }

    @And("Clicks on submit button")
    public void clicksOnSubmitButton() {
        homePage1a.clickSubButt();
    }

    @When("Gives {int} sec for page to load and scroll down")
    public void givesSecForPageToLoadAndScrollDown(int arg0)throws InterruptedException {
        Thread.sleep(3500);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
    }

    @And("Clicks on brand filter")
    public void clicksOnBrandFilter() {
        homePage1a.clickOnProduct();
    }

    @And("Gives {int} sec sleep and scroll down")
    public void givesSecSleepAndScrollDown(int arg0) throws InterruptedException {
        Thread.sleep(3500);
        js.executeScript("window.scrollBy(0,200)", "");
    }

    @When("Find the needed device and clicks on it")
    public void findTheNeededDeviceAndClicksOnIt() {
        homePage1a.clickOnIphone();
    }

    @Then("User appeard on product page, scrolls down")
    public void userAppeardOnProductPageScrollsDown() {
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    @When("Finds cart button")
    public void findsCartButton() {
        cartPage1a.clickOnCartButt();
    }

    @And("Clicking on submit button")
    public void clickingOnSubmitButton() throws InterruptedException {
        Thread.sleep(2000);
        cartPage1a.clickOnSubmitAndGoToCart();
        Thread.sleep(2000);
    }

    @Then("Gives {int} sec for page to load and prints in console the name of the product and validates the correctness on name given and actual name")
    public void givesSecForPageToLoadAndPrintsInConsoleTheNameOfTheProductAndValidatesTheCorrectnessOnNameGivenAndActualName(int arg0) {
        String nameOfTheProduct = driver.findElement(By.xpath("//a[@class='detailed-cart-item__name-link']")).getText();
        System.out.println("We are buying   " + nameOfTheProduct);
        softAssert.assertEquals(productModel.productName, nameOfTheProduct,"!!!   Product name is incorrect");
    }

    @And("User scrolls down")
    public void userScrollsDown() {
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    @And("Click on BUY button")
    public void clickOnBUYButton() {
        cartPage1a.clickOnBuyButt();
    }

    @Then("Cart page where users starts to fill the email to log in")
    public void cartPageWhereUsersStartsToFillTheEmailToLogIn() {
        cartPage1a.clickOnEmailField(userDataModel.CusLoginEmail);

    }

    @And("Fill the field with password")
    public void fillTheFieldWithPassword() {
        cartPage1a.clickOnPasswordField((userDataModel.CusPass));
    }

    @And("Clicks on submit button and giving {int} sec sleep for page to load")
    public void clicksOnSubmitButtonAndGivingSecSleepForPageToLoad(int arg0) throws InterruptedException {
        cartPage1a.clickOnSubmitBut();

        Thread.sleep(2000);
    }

    @When("User selects the delivery option")
    public void userSelectsTheDeliveryOption() {
        cartPage1a.clickOnDeliveryOptionRiga();
    }

    @And("Scroll down the page")
    public void scrollDownThePage() {
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    @When("Users inputs name")
    public void usersInputsName() {
        cartPage1a.clickOnNameBox(userDataModel.CusName);
    }

    @And("Surname")
    public void surname() {
        cartPage1a.clickOnSurnameBox(userDataModel.CusSur);
    }

    @And("Phone number in the given field")
    public void phoneNumberInTheGivenField() {
        cartPage1a.clickOnPhoneBox(userDataModel.CusPhone);
    }

    @And("Scroll a bit down and gives {int} sec rest for page to load")
    public void scrollABitDownAndGivesSecRestForPageToLoad(int arg0) throws InterruptedException  {
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
    }

    @When("Clicking on final submit button to save changes")
    public void clickingOnFinalSubmitButtonToSaveChanges() {
        cartPage1a.clickOnFinalSubmitBitt();
    }

    @Then("User gives {int} sec rest and print in console Name and Surname of customer")
    public void userGivesSecRestAndPrintInConsoleNameAndSurnameOfCustomer(int arg0) throws InterruptedException  {
        Thread.sleep(3000);

        WebElement nameAtTheBeginning = driver.findElement(By.xpath("//div[@class='name']"));
        System.out.println("Customer name and surname and the beginning -  " + nameAtTheBeginning.getText());
    }

    @When("Gives {int} sec rest and clicks on submit button one more time")
    public void givesSecRestAndClicksOnSubmitButtonOneMoreTime(int arg0)  throws InterruptedException {
        Thread.sleep(1000);
        cartPage1a.clickOnFinalSubmitBitt();
    }


    @Then("Print in console the final price of the product and validates the correctness on price given and actual price of the product")
    public void printInConsoleTheFinalPriceOfTheProductAndValidatesTheCorrectnessOnPriceGivenAndActualPriceOfTheProduct() {
        String priceEnd = driver.findElement(By.xpath("//span[@class='checkout-order-summary-total__price']")).getText();
        System.out.println("Product price and the end -  " + priceEnd);
        softAssert.assertEquals(productModel.productPrice, priceEnd,"!!!   Given price  is  incorrect");
    }



    @And("Click on {int}a logo to open home page")
    public void clickOnALogoToOpenHomePage(int arg0) {
        logOutAfterTestPage.clickOnLogo();

    }

    @And("Clicks on profile")
    public void clicksOnProfile() {
        logOutAfterTestPage.clickOnProfileButt();


    }

    @And("Click on deleta user data for further tests.")
    public void clickOnDeletaUserDataForFurtherTests() {
        logOutAfterTestPage.clickOnDeleteDataBut();
    }

    @And("Closes the window.")
    public void closesTheWindow() {
        basePage1a.stopDriver();
    }
}



