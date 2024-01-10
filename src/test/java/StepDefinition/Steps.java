package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Steps {
	WebDriver driver;
	
	@Given("abrir navegador")
	public void abrir_navegador() {
		System.out.println("abriendo el navegador");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matias\\Downloads\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/Integracion");
	}
	
	@When("ingresar nombre de usuario {string} y contrasenha {string}")
	public void ingresar_Usuario_y_Contrasenha(String string, String string2) {
		System.out.println("ingresando las credenciales de usuario");
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}
	
	@Then("iniciar sesion")
	public void iniciar_sesion() {
		System.out.println("iniciando sesion");
		driver.findElement(By.id("Iniciar")).click();
	}
}