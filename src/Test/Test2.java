package Test;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver getDriver;
	
	@BeforeTest
	public void openConnection(){
		System.out.println("Test2 Starting...");
		getDriver=new FirefoxDriver();
	}
	
	@AfterTest
	public void closeConnection(){
		System.out.println("Test2 Closing...");
		 getDriver.close();
	}
	@Test
	public void T1(){
		 getDriver.get("http://facebook.com");
		 System.out.println("test2 in progress...");

	}

}
