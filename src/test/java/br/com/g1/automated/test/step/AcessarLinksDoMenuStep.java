package br.com.g1.automated.test.step;

import br.com.g1.automated.test.action.HomeAction;
import br.com.g1.automated.test.config.DriverConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class AcessarLinksDoMenuStep {

    private HomeAction home = new HomeAction();

    @After
    public void tearDown() {
        home.closeBrowser();
    }

    @Given("o usuário esta na pagina Home")
    public void oUsuárioEstaNaPaginaHome() {
        home.accessHome();
    }

    @Given("o Menu Home aberto")
    public void oMenuHomeAberto() {
        home.clickMenu();
    }

    @When("acessa blogs e colunas")
    public void acessaBlogsEColunas() {
        home.clickBlogsEColunas();
    }

    @Then("e direcionado a {string}")
    public void eDirecionadoA(String string) {
    }
}
