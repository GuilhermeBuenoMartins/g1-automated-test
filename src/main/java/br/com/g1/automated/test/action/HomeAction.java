package br.com.g1.automated.test.action;

import br.com.g1.automated.test.config.DriverConfig;
import br.com.g1.automated.test.page.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomeAction extends DriverConfig{

    private HomePage homePage = new HomePage();

    public void accessHome(){
        this.openBroswer(homePage.URL);
    }

    public void clickMenu(){
        this.webDriver.findElement(By.xpath(homePage.MENU)).click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickBlogsEColunas(){
        this.webDriver.findElement(By.xpath(homePage.BLOGS_E_COLUNA));
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
