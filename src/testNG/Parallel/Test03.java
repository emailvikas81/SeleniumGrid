package testNG.Parallel;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class Test03  {//extends TestBase{
 
    @Test
    public void testLink()throws Exception{
//        getDriver().get("http://facebook.com");
//        WebElement textBox = getDriver().findElement(By.xpath("//input[@value='Re-enter Email']"));
//        textBox.click();
//        textBox.sendKeys("Test three!");
//        Thread.sleep(2000);
    	WebDriver getDriver=new FirefoxDriver();
		 getDriver.get("https://google.com");
		 getDriver.close();
    }
}