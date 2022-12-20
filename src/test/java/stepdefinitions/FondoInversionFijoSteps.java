package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FondoInversionFijoSteps {

    private String inversionMinima;
    @Given("un usuario requiere una inversion de renta fija")
    public void unUsuarioRequiereUnaInversionDeRentaFija() {
    }

    @When("cumple los requisitos minimos del monto de inversion {string} COP")
    public void cumpleLosRequisitosMinimosDelMontoDeInversionCOP(String inversion) {
        inversionMinima = inversion;
        System.out.println("When ");
    }


    @Then("la inversion es exitosa.")
    public void laInversionEsExitosa() {
        Assert.assertEquals(inversionMinima, "25.000");
        System.out.println("FINALIZA PRUEBA");
    }




}
