
package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class drive {

   public static void main(String[] args) {

        File file = new File("C:\\Users\\eMotion\\Desktop\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.casasbahia.com.br");

        //driver.close();
        WebElement caixaDeBusca = driver.findElement(By.id("strBusca"));
        caixaDeBusca.sendKeys("vocês são os melhores");
        caixaDeBusca.clear();
        caixaDeBusca.sendKeys("aspirador de po robo");

        WebElement botaoBusca = driver.findElement(By.id("btnOK"));
        botaoBusca.click();

      //driver.close();
    }

}
