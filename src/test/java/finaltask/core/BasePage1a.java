package finaltask.core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage1a {


    public static ChromeDriver getDriver() {
        if (driver == null) {
            startDriver();
        }

        return driver;
    }

        public static void  startDriver() {

        String path = "C:\\Users\\nbort\\IdeaProjects\\Final-Task-For-Java-Guru\\src\\test\\java\\finaltask\\core\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);}

        public void stopDriver() {driver.quit();}

}


