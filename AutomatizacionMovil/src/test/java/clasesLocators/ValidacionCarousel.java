package clasesLocators;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;


import io.appium.java_client.TouchAction;
import utility.Hook;
import utility.Scroll;

public class ValidacionCarousel {
	  
	  
	  public static void login(String username, String password)
	  {
//		   	Hook.getDriver().findElement(By.xpath("//android.widget.EditText[@content-desc=\"username\"]")).clear();
//		    Hook.getDriver().findElement(By.xpath("//android.widget.EditText[@content-desc=\"username\"]")).sendKeys(username);
//		    Hook.getDriver().findElement(By.xpath("//android.widget.EditText[@content-desc=\"password\"]")).clear();
//		    Hook.getDriver().findElement(By.xpath("//android.widget.EditText[@content-desc=\"password\"]")).sendKeys(password);
		    Hook.getDriver().findElement(By.xpath("//android.view.View[@content-desc=\"login\"]/android.widget.Button/android.widget.TextView")).click();

	  }
	  
	  
	  public static void scrollUp(TouchAction touch, int X0, int Y0, int Xend, int Yend)
	  {
		  
		  try {
			 // TouchAction touch = new TouchAction(Hook.getDriver());
			Scroll.verticalSwipe(touch, X0, Y0, Xend, Yend);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  public static void tap(String opcion)
	  {
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Hook.getDriver().findElement(By.xpath("//android.view.View[@content-desc=\"carousel\"]/android.view.View")).click();
			//VALIDACION

	  }
	  
	  public static void validarNumero(String numero)
	  {
			Assert.assertTrue(Hook.getDriver().findElement(By.className("android.widget.TextView")).getText().contains("1"));

	  }
	   

}
