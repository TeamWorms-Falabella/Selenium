import clases.ingresoPortal;
import clases.JUnitSampleTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class app {

    static WebDriver driver;

    @Before
    public void iniciarConexion() throws IOException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        /*driver = new ChromeDriver();
        driver.get("https://www.entel.cl/");
        driver.manage().window().maximize();
*/
    }
    @Test
    public void classes() throws IOException{
        JUnitSampleTest objJU = new JUnitSampleTest();

        objJU.sampleTest0();
        objJU.sampleTest1();
        objJU.sampleTest2();
        objJU.sampleTest4();
        //ingresoPortal.inicioSesion(driver);

    }

}
