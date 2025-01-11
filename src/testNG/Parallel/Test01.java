package testNG.Parallel;
 
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class Test01 {//extends TestBase{
 
    @Test
    public void testLink()throws Exception{
//        getDriver().get("http://facebook.com");
//        WebElement textBox = getDriver().findElement(By.xpath("//input[@value='Your Email']"));
//        textBox.click();
//        textBox.sendKeys("Just a test!");
//        Thread.sleep(2000);
    	//JOptionPane.showMessageDialog(null, 1);
    	WebDriver getDriver=new FirefoxDriver();
		 getDriver.get("https://twitter.com");
		 getDriver.close();
    }
}