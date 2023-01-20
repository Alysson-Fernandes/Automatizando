package modulos.cadastro;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

@DisplayName("Teste Web do Cadastro de Usuario")
public class CadastroTest {
    private WebDriver navegador;
    @BeforeEach
    public void beforeEach(){
        //Abrir navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        this.navegador = new ChromeDriver();
        //Maximizar a tela
        this.navegador.manage().window().maximize();
        //Navegar em um site
        this.navegador.get("https://demo.automationtesting.in/Register.html");
    }
    @Test
    @DisplayName("Cadastrar Usuario")
    public void cadastroDeUsuarioCompleto() throws InterruptedException {
        //Registrar o Usuário
        navegador.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).click();
        navegador.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("Alysson");
        navegador.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).click();
        navegador.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys("Fernandes Marques");
        navegador.findElement(By.xpath("//textarea")).click();
        navegador.findElement(By.xpath("//textarea")).sendKeys("Testando Campo de texto de Área! ('.')");
        navegador.findElement(By.cssSelector("input[type='email']")).click();
        navegador.findElement(By.cssSelector("input[type='email']")).sendKeys("teste@gmail.com");
        navegador.findElement(By.cssSelector("input[type='tel']")).click();
        navegador.findElement(By.cssSelector("input[type='tel']")).sendKeys("(99)08888-4574");
        navegador.findElement(By.cssSelector("input[value='Male']")).click();
        navegador.findElement(By.cssSelector("input[id='checkbox1']")).click();
        navegador.findElement(By.cssSelector("input[id='checkbox2']")).click();
        navegador.findElement(By.cssSelector("input[id='checkbox3']")).click();
        Thread.sleep(500);
        navegador.findElement(By.cssSelector("div[id=\"msdd\"]")).click();
        Thread.sleep(500);

        for (By by : Arrays.asList(
                By.xpath("//multi-select//div//ul//li[1]"),
                By.cssSelector("input[type='tel']"),
                By.cssSelector("select[id=\"Skills\"]"),
                By.cssSelector("option[value='Adobe Photoshop']"),
                By.cssSelector("span[tabindex=\"-1\"]"),
                By.cssSelector("option[value=\"Hong Kong\"]"),
                By.cssSelector("select[id=\"yearbox\"]"),
                By.cssSelector("OPTION[value=\"1916\"]"),
                By.cssSelector("select[placeholder=\"Month\"]"),
                By.cssSelector("option[value=\"January\"]"),
                By.cssSelector("select[id=\"daybox\"]"),
                By.cssSelector("option[value=\"13\"]")
                )) { navegador.findElement(by).click();        }
        navegador.findElement(By.cssSelector("input[id=\"firstpassword\"]")).click();
        navegador.findElement(By.cssSelector("input[id=\"firstpassword\"]")).sendKeys("123123123123");
        navegador.findElement(By.cssSelector("input[id=\"secondpassword\"]")).click();
        navegador.findElement(By.cssSelector("input[id=\"secondpassword\"]")).sendKeys("123123123123");
        navegador.findElement(By.cssSelector(q"button[id='submitbtn']")).click();
    }
   /* @AfterEach
    public void afterEach(){
        //fechar o navegador
        navegador.quit();
    }*/
}
