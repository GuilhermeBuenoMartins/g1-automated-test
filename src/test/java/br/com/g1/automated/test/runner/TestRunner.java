package br.com.g1.automated.test.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "src/test/resources",
        glue = "br.com.g1.automated.test",
        plugin = {"pretty", "html:target/cucumber"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class TestRunner {


}