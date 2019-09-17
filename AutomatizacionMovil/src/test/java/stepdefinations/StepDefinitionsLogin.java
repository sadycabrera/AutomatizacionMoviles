package stepdefinations;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;

import clasesLocators.ValidacionCarousel;
import utility.Hook;
public class StepDefinitionsLogin {
	
	ValidacionCarousel validacionCarousel;

	@Given("^Abrir el app$")
	public void Abrir_el_app() throws Throwable {

		Hook.setUpAppium();
	}
	
	@When("^Se accede con el usuario \"([^\"]*)\" y con la clave \"([^\"]*)\"$")
	public void se_accede_con_el_usuario_y_con_la_clave(String username, String password) throws Throwable {
		ValidacionCarousel.login(username, password);
	}
	
	@SuppressWarnings("static-access")
	@And("^Se hace Scroll hacia abajo hasta encontrar la opcion \"([^\"]*)\"$")
	public void se_hace_Scroll_hacia_abajo_hasta_encontrar_la_opcion(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TouchAction touch= new TouchAction(Hook.getDriver());
		validacionCarousel.scrollUp(touch, 200, 1080, 200, 1020);
	}

	@SuppressWarnings("static-access")
	@And("^Hace tap en \"([^\"]*)\"$")
	public void hace_tap_en(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    validacionCarousel.tap(arg1);
	}

	@SuppressWarnings("static-access")
	@Then("^Valida que el primer elemento mostrado es \"([^\"]*)\"$")
	public void valida_que_el_primer_elemento_mostrado_es(String numero) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    validacionCarousel.validarNumero(numero);
	}
	
	

	
}
