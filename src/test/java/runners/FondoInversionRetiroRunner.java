package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/FondoInversionFijoRetiro.feature"
        , glue = {"stepdefinitions"}
        , tags = "@RutaCritica"

        , plugin = {"pretty", "html:target/cucumber/reporte", "json:target/FondoInversionFijoRetiro.json"})
public class FondoInversionRetiroRunner {


}
