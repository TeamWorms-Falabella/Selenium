package clases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ingresoPortal {

    static WebDriver driver;

    public static String rut = "173643403";
    public static String numero = "966986551";
    public static String codigo = "1641";

    public static void inicioSesion(WebDriver driver){
        try{
            WebElement botonIngreso = driver.findElement(By.xpath("//*[@id='enlaces']"));
            botonIngreso.click();
            Thread.sleep(2000);
            WebElement campoTelefono = driver.findElement(By.xpath("//*[@id='username']"));
            campoTelefono.sendKeys(numero);
            Thread.sleep(2000);
            WebElement campoRut = driver.findElement(By.xpath("//*[@id='rut']"));
            campoRut.sendKeys(rut);
            Thread.sleep(2000);
            WebElement campoPassword = driver.findElement(By.xpath("//*[@id='password']"));
            campoPassword.sendKeys(codigo);
            Thread.sleep(2000);
            WebElement botonInicioSesion = driver.findElement(By.xpath("//*[@id='action-PROFILE_LOGIN']"));
            botonInicioSesion.click();

        }catch(Exception e){
            System.out.println("Error: ");
        }

    }

}
