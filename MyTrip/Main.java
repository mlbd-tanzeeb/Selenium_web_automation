package MyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.tripadvisor.com/");

        WebElement button = driver.findElement(By.linkText("Hotels"));
        button.click();



        Thread.sleep(5000);
        WebElement text = driver.findElement(By.cssSelector("div.weiIG:nth-child(1) > form:nth-child(2) > input:nth-child(1)"));
        text.click();
        text.sendKeys("Switzerland");






        Thread.sleep(3000);

        WebElement search = driver.findElement(By.xpath("//div[@class='dPHgr']//div[@class='WlYyy diXIH bQCoY'][contains(text(),'Europe')]"));

        search.click();




        WebElement CheckInDate = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div > div > div.kAgrN > div > div.fZVmW.q.c > div:nth-child(2) > div.nZEkx.notranslate > div:nth-child(1) > div:nth-child(3)"));
       CheckInDate.click();

        WebElement CheckOutDate = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div > div > div.eLjPa > div > div.fZVmW.q.c > div:nth-child(1) > div.nZEkx.notranslate > div:nth-child(2) > div:nth-child(5)"));
        CheckOutDate.click();


        WebElement Childselect = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div.ccWaH.S4.z > div:nth-child(3) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3) > span"));
        Childselect.click();


        WebElement childAge = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.cJbNW.Mf.Z._V > div > div > button"));
        childAge.click();

        Thread.sleep(3000);

        WebElement childAge = driver.findElement(By.xpath("//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[7]/div/div/div/div[2]/button[3]/span"));
        childAge.click();


        WebElement update = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.chkmV.Mf > button"));
        update.click();

        Thread.sleep(3000);

        WebElement starRating = driver.findElement(By.cssSelector("#component_13 > div > div.dSlNe.bhcPI > div:nth-child(6) > div.czbRE > div:nth-child(4) > div > label > div > span.eLkFw > span"));
       starRating.click();

        WebElement result = driver.findElement(By.cssSelector("#property_264882"));
        result.getText();
        System.out.println(result.getText());




    }
}
