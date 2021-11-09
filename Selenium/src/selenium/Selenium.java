
package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class Selenium {

    public static void main(String[] args) {
        abrirChrome();
    }
    private static void abrirChrome() {
        File file = new File("C:\\Users\\eMotion\\Desktop\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("http:aluno.unibh.br");
        String i = driver.getCurrentUrl();
        System.out.println(i);
        driver.close();
    }
}
