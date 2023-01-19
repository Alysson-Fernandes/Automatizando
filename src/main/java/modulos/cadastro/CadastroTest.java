package modulos.cadastro;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    public void cadastroDeUsuarioCompleto(){
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
        navegador.findElement(By.cssSelector("div[id=\"msdd\"]")).click();
        navegador.findElement(By.xpath("//multi-select//div//ul//li[1]")).click();
        navegador.findElement(By.xpath("//multi-select//div//ul//li[3]")).click();
        navegador.findElement(By.xpath("//multi-select//div//ul//li[5]")).click();
        navegador.findElement(By.xpath("//multi-select//div//ul//li[7]")).click();
        navegador.findElement(By.xpath("//multi-select//div//ul//li[9]")).click();
        navegador.findElement(By.cssSelector("input[type='tel']")).click();
        navegador.findElement(By.cssSelector("select[id=\"Skills\"]")).click();
        //navegador.findElement(By.cssSelector("option[value='Adobe Photoshop']")).click();
       // navegador.findElement(By.cssSelector("select[id=\"country\"]")).click();
    }
    @AfterEach
    public void afterEach(){
        //fechar o navegador
        navegador.quit();
    }
}
