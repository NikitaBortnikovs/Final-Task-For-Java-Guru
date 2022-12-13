package finaltask.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

    public class BasePage1a {
        public static ChromeDriver driver;
        public static void  startDriver() {

        String path = "C:\\Users\\nbort\\IdeaProjects\\AnotherProject\\src\\test\\java\\finaltask\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);}

        public void stopDriver() {driver.quit();}
}


