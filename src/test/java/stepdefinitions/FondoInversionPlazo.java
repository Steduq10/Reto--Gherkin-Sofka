package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class FondoInversionPlazo {
    private boolean estadoCuenta = true;
    private String mesesMinimos;
    @Given("un usuario requiere cambiar el plazo de renta de su inversion")
    public void unUsuarioRequiereCambiarElPlazoDeRentaDeSuInversion() {
        System.out.println("Prueba iniciada");
    }

    @And("tiene una cuenta activa en el fondo de inversion")
    public void tieneUnaCuentaActivaEnElFondoDeInversion() {
        Assertions.assertTrue(estadoCuenta, "La cuenta está inactiva");
    }

    @When("cumple los requisitos minimos de antiguedad de {string} meses")
    public void cumpleLosRequisitosMinimosDeAntiguedadDeMeses(String meses) {
        mesesMinimos = meses;
        Assertions.assertEquals(mesesMinimos, "3", "No cumple con el tiempo mínimo de antiguedad en el fondo de inversión");

    }

    @Then("el usuario cambia el plazo de renta de su inversion")
    public void elUsuarioCambiaElPlazoDeRentaDeSuInversion() {
        System.out.println("Plazo de renta cambiado");
    }
}
