package br.com.g1.automated.test.config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverConfig {

    private final String CHROME_PATH = "src/main/java/br/com/g1/automated/test/driver/chromedriver.exe";

    public WebDriver webDriver;

    public DriverConfig() {
        System.setProperty("webdriver.chrome.driver", CHROME_PATH);
        this.webDriver = new ChromeDriver();
    }

    public void openBroswer(String url) {
        this.webDriver.get(url);
        try {
            TimeUnit.SECONDS.sleep(3);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeBrowser() {
        try {
            this.webDriver.close();
            this.webDriver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

