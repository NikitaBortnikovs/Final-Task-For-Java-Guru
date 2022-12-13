package finaltask.runners;
import finaltask.models.ProductModel;
import finaltask.models.UserDataModel;
import finaltask.pages.LogOutAfterTestPage;
import finaltask.core.BasePage1a;
import finaltask.pages.CartPage1a;
import finaltask.pages.HomePage1a;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;


public class TestPage1a extends HomePage1a {
      HomePage1a homePage1a = new HomePage1a();
      CartPage1a cartPage1a = new CartPage1a();
      ProductModel productModel = new ProductModel();
      UserDataModel userDataModel = new UserDataModel();
      BasePage1a basePage1a = new BasePage1a();
      LogOutAfterTestPage afterTestPage = new LogOutAfterTestPage();

      SoftAssert softAssert = new SoftAssert();
      JavascriptExecutor js = (JavascriptExecutor) driver;


      @Test

      public void TestPage() throws InterruptedException {
        homePage1a.openBaseUrll();
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        homePage1a.clickAcceptCookies();
        homePage1a.clickOnProdCatBut();
        homePage1a.clickOnCatPhones();


        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,400)", "");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,400)", "");
        homePage1a.clickOnSubCatPhones();

        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        homePage1a.clickOnSubSubCatPhones();

        Thread.sleep(2500);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1500);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2500);
        actions.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(1500);
        actions.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(2500);

        homePage1a.searchForProd(productModel.productNameForSearching);
        homePage1a.clickSubButt();

        Thread.sleep(3500);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        homePage1a.clickOnProduct();


        Thread.sleep(3500);
        js.executeScript("window.scrollBy(0,200)", "");
        homePage1a.clickOnIphone();


        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        cartPage1a.clickOnCartButt();
        Thread.sleep(2000);
        cartPage1a.clickOnSubmitAndGoToCart();
        Thread.sleep(2000);

        String nameOfTheProduct = driver.findElement(By.xpath("//a[@class='detailed-cart-item__name-link']")).getText();
        System.out.println("We are buying   " + nameOfTheProduct);
        softAssert.assertEquals(productModel.productName, nameOfTheProduct,"!!!   Product name is incorrect");

        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        cartPage1a.clickOnBuyButt();

        cartPage1a.clickOnEmailField(userDataModel.CusLoginEmail);
        cartPage1a.clickOnPasswordField((userDataModel.CusPass));
        cartPage1a.clickOnSubmitBut();

        Thread.sleep(2000);
        cartPage1a.clickOnDeliveryOptionRiga();
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        cartPage1a.clickOnNameBox(userDataModel.CusName);
        cartPage1a.clickOnSurnameBox(userDataModel.CusSur);
        cartPage1a.clickOnPhoneBox(userDataModel.CusPhone);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        cartPage1a.clickOnFinalSubmitBitt();
        Thread.sleep(3000);

        WebElement nameAtTheBeginning = driver.findElement(By.xpath("//div[@class='name']"));
        System.out.println("Customer name and surname and the beginning -  " + nameAtTheBeginning.getText());
        Thread.sleep(1000);
        cartPage1a.clickOnFinalSubmitBitt();

        String priceEnd = driver.findElement(By.xpath("//span[@class='checkout-order-summary-total__price']")).getText();
        System.out.println("Product price and the end -  " + priceEnd);
        softAssert.assertEquals(productModel.productPrice, priceEnd,"!!!   Given price  is  incorrect");

        String nameAtTheEnd = driver.findElement(By.xpath("//div[@class='name']")).getText();
        softAssert.assertTrue(nameAtTheEnd.contains(userDataModel.CusName),"Name is incorrect");
        softAssert.assertTrue(nameAtTheEnd.contains(userDataModel.CusSur),"Surname is incorrect");



        afterTestPage.clickOnLogo();
        afterTestPage.clickOnProfileButt();
        afterTestPage.clickOnDeleteDataBut();

        basePage1a.stopDriver();
        softAssert.assertAll();

    }
}
