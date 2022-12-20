package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FondoInversionDivisa {
    List<String> Divisas= Arrays.asList("Pesos","Dollares","Libras");
    @Given("un usuario requiere seleccionar la divisa para  su inversion")
    public void unUsuarioRequiereSeleccionarLaDivisaParaSuInversion() {
        System.out.println("Iniciar Prueba");
    }

    @When("abrir una cuenta de fondo de inversion  en {string} divisa")
    public void abrirUnaCuentaDeFondoDeInversionEnDivisa(String divisa) {
        assertThat(Divisas, Matchers.anyOf(Matchers.hasItem(divisa)));


    }

    @Then("divisa seleccionada con  exito")
    public void divisaSeleccionadaConExito() {
    }
}
