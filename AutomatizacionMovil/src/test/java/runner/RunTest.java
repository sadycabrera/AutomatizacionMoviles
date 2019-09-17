package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;//Para ejecutar con TestNG
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//**MEDIANTE ESTE CLASE SE PUEDE EJECUTAR LAS PRUEBAS MEDIANTE JUNIT o TESTNG A LA VEZ SIN MODIFICAR NADA.*//

@CucumberOptions(features={"src//test//java//features//Login.feature"}
					,glue={"stepdefinations","utility"}
					,plugin = {"pretty", "html:target/cucumber"})
//SE ACTIVAS Test PARA EJECUTAR CON 

@RunWith(Cucumber.class)
public class RunTest {

}

//@Test
//public class RunTest extends AbstractTestNGCucumberTests{

//}
	