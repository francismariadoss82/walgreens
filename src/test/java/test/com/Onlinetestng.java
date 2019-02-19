/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author sstani1
 */
public class Onlinetestng {

    private WebDriver driver;
    private String baseUrl;

    public Onlinetestng() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test

    public void testWalgreensonline() throws Exception {
        driver.findElement(By.id("ntt-placeholder")).click();
        driver.findElement(By.id("ntt-placeholder")).clear();
        driver.findElement(By.id("ntt-placeholder")).sendKeys("tylenol");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Skip to main content'])[1]/following::span[3]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Count:'])[1]/following::div[2]")).click();
        driver.findElement(By.id("add-to-cart-btncompare_sku305332")).click();
        driver.findElement(By.id("addToCart-cart-checkout")).click();
        /*   driver.get("https://www.google.com/");
    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='×'])[1]/following::div[20]")).click();
    //driver.findElement(By.name("q")).click();
    //driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("walgreens");
    driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Walgreens. Trusted Since 1901.'])[1]/following::cite[1]")).click();
    driver.findElement(By.id("ntt-placeholder")).click();
    driver.findElement(By.id("ntt-placeholder")).clear();
    driver.findElement(By.id("ntt-placeholder")).sendKeys("tylenol");
    driver.findElement(By.id("ntt-placeholder")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("ntt-placeholder")).clear();
    driver.findElement(By.id("ntt-placeholder")).sendKeys("tylenol");
    driver.findElement(By.id("ntt-placeholder")).click();
    driver.findElement(By.id("ntt-placeholder")).clear();
    driver.findElement(By.id("ntt-placeholder")).sendKeys("tylenol");
    Thread.sleep(10000);
    driver.findElement(By.xpath("//*[@id=\"secImgcompare_sku305351\"]")).click();
   driver.findElement(By.id("gettypeaheadlistmouseover")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=gettypeaheadlistmouseover | ]]
    driver.findElement(By.id("secImgcompare_sku305351")).click();
    driver.findElement(By.xpath("//div[@id='product']/div/div")).click();
    driver.findElement(By.id("receiveing-addToCartbtn")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Subtotal:'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save for later'])[3]/following::a[1]")).click();
    driver.findElement(By.id("proceedtocheckout")).click();
    driver.findElement(By.id("userName-phoneNo")).clear();
    driver.findElement(By.id("userName-phoneNo")).sendKeys("mafrancis08@gmail.com");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Nathan2017");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Continue'])[1]/following::button[1]")).click();
    driver.findElement(By.id("wag-cko-id-sa-inp-fn")).click();
    driver.findElement(By.id("wag-cko-id-sa-inp-fn")).clear();
    driver.findElement(By.id("wag-cko-id-sa-inp-fn")).sendKeys("maria");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name:'])[1]/following::strong[1]")).click();
    driver.findElement(By.id("wag-cko-id-sa-inp-ln")).click();
    driver.findElement(By.id("wag-cko-id-sa-inp-ln")).clear();
    driver.findElement(By.id("wag-cko-id-sa-inp-ln")).sendKeys("francis");
    driver.findElement(By.id("wag-cko-id-sa-inp-add")).click();
    driver.findElement(By.id("wag-cko-id-sa-inp-add")).clear();
    driver.findElement(By.id("wag-cko-id-sa-inp-add")).sendKeys("11 westfield ln");
    driver.findElement(By.id("wag-cko-id-sa-inp-city")).click();
    driver.findElement(By.id("wag-cko-id-sa-inp-city")).clear();
    driver.findElement(By.id("wag-cko-id-sa-inp-city")).sendKeys("des plaines");
    driver.findElement(By.id("wag-cko-id-sa-sel-state")).click();
 //   new Select(driver.findElement(By.id("wag-cko-id-sa-sel-state"))).selectByVisibleText("IL - Illinois");
    driver.findElement(By.id("wag-cko-id-sa-sel-state")).click();
    driver.findElement(By.id("wag-cko-id-sa-inp-zip")).click();
    driver.findElement(By.id("wag-cko-id-sa-inp-zip")).clear();
    driver.findElement(By.id("wag-cko-id-sa-inp-zip")).sendKeys("60018");
    driver.findElement(By.id("ship-to")).click();
    driver.findElement(By.id("wag-cko-conin-inp-email")).click();
    driver.findElement(By.id("wag-cko-conin-inp-email")).clear();
    driver.findElement(By.id("wag-cko-conin-inp-email")).sendKeys("mafrancis08@gmail.com");
    driver.findElement(By.id("ship-to")).click();
    driver.findElement(By.id("wag-cko-conin-inp-phnum")).click();
    driver.findElement(By.id("wag-cko-conin-inp-phnum")).clear();
    driver.findElement(By.id("wag-cko-conin-inp-phnum")).sendKeys("2243866006");
    driver.findElement(By.xpath("//section[2]")).click();
    driver.findElement(By.id("wag-cko-sa-id-btn-sel-g")).click();
    driver.findElement(By.name("countyList")).click();
 //   new Select(driver.findElement(By.name("countyList"))).selectByVisibleText("DES PLAINES, IL 60018 COOK - within city limits");
    driver.findElement(By.name("countyList")).click();
    driver.findElement(By.id("wag-cko-sa-id-btn-sel-g")).click();
    driver.findElement(By.id("wag-cko-pm-in-cc-num")).click();
    driver.findElement(By.id("wag-cko-pm-in-cc-num")).clear();
    driver.findElement(By.id("wag-cko-pm-in-cc-num")).sendKeys("1234578563321466");
 //   new Select(driver.findElement(By.id("wag-cko-pm-sel-cc-exp-mon"))).selectByVisibleText("01 - Jan");
    driver.findElement(By.id("wag-cko-pm-sel-cc-exp-mon")).click();
    driver.findElement(By.id("wag-cko-pm-sel-cc-exp-year")).click();
 //   new Select(driver.findElement(By.id("wag-cko-pm-sel-cc-exp-year"))).selectByVisibleText("2020");
    driver.findElement(By.id("wag-cko-pm-sel-cc-exp-year")).click();
    driver.findElement(By.id("wag-cko-id-sa-inp-fn")).click();
    driver.findElement(By.id("wag-cko-id-sa-inp-fn")).clear();
    driver.findElement(By.id("wag-cko-id-sa-inp-fn")).sendKeys("");
    driver.findElement(By.id("wag-cko-pm-lb-sasadd")).click();
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.id("wag-cko-sa-id-btn-sel-g")).click();*/

    }

    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.walgreens.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
}
