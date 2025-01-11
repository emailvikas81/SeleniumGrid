package testNG.Parallel;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class Test04  {//extends TestBase{
 
    @Test
    public void testLink()throws Exception{
//        getDriver().get("https://twitter.com");
//        WebElement textBox = getDriver().findElement(By.xpath("//label1"));
//        textBox.click();
//        textBox.sendKeys("Test 4!");
//        Thread.sleep(2000);
	
	WebDriver getDriver=new FirefoxDriver();
	 getDriver.get("https://facebook.com");
	 getDriver.close();
    }
}