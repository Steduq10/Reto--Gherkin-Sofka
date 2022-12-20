package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class FondoInversionRetiro {
 private boolean estadoCuenta = true;
 private String mesesTotal;

 @Given("un usuario requiere retirar sus ganancias de inversion de renta fija")
 public void unUsuarioRequiereRetirarSusGananciasDeInversionDeRentaFija() {
  System.out.println("Prueba Iniciada");
 }

 @And("tiene un producto activo en el fondo de inversion")
 public void tieneUnProductoActivoEnElFondoDeInversion() {

  Assertions.assertTrue(estadoCuenta, "La cuenta está inactiva");
 }

 @When("cubre  el  tiempo  total  de inversion {string} Meses")
 public void cubreElTiempoTotalDeInversionMeses(String meses) {
  mesesTotal = meses;
  Assertions.assertEquals(mesesTotal, "12", "No cumple con el tiempo para retirar los dividendos de la  inversion");
 }

 @Then("el  retiro es exitoso.")
 public void elRetiroEsExitoso() {
 }


}