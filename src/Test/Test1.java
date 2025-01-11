package Test;
//run through testng.xml
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver getDriver;
	
	@BeforeTest
	public void openConnection(){
		System.out.println("Test1 Starting...");
		getDriver=new FirefoxDriver();
	}
	
	@AfterTest
	public void closeConnection(){
		System.out.println("Test1 Closing...");
		 getDriver.close();
	}
	@Test
	public void T1(){
		 getDriver.get("http://facebook.com");
		 System.out.println("test1 in progress...");

	}

}
