package com.Guru99.Pages;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


import com.Guru99.Utility.ActionUtils;
import com.Guru99.Utility.PropertiesUtils;



public class BaseClass {
	public PropertiesUtils pu = null;
	public WebDriver driver = null;
	public ActionUtils au = null;
	
	
	@BeforeMethod
	public void setUp() {
		pu = new PropertiesUtils();
		
		
		if (pu.readProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", pu.readProperty("chromeDriverfilePath"));
			driver = new ChromeDriver();
		}
		if (pu.readProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", pu.readProperty("geckoDriverfilePath"));
			driver = new FirefoxDriver();
		}
		driver.get(pu.readProperty("BaseUrl"));
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(pu.readProperty("pageload")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(pu.readProperty("pageload")), TimeUnit.SECONDS);
	}
	

	public void addUser() {
		au=new ActionUtils();
		au.click(driver.findElement(By.xpath(pu.readProperty("Adduser"))));
		au.click(driver.findElement(By.xpath(pu.readProperty("Chkbutn"))));
		au.typeIn(driver.findElement(By.id("fname")), pu.readProperty("fname"));
		au.typeIn(driver.findElement(By.id("lname")), pu.readProperty("lname"));
		au.typeIn(driver.findElement(By.id("email")), pu.readProperty("email"));
		au.typeIn(driver.findElement(By.xpath(pu.readProperty("add"))), pu.readProperty("Address"));
		au.typeIn(driver.findElement(By.id("telephoneno")), pu.readProperty("mobileno"));
		au.click(driver.findElement(By.xpath(pu.readProperty("submit"))));
	}
	
	public void addUser_Missing_Credentials() {
		au=new ActionUtils();
		au.click(driver.findElement(By.xpath(pu.readProperty("Adduser"))));
		au.click(driver.findElement(By.xpath(pu.readProperty("Chkbutn"))));
		au.typeIn(driver.findElement(By.id("fname")), pu.readProperty("fname"));
		au.typeIn(driver.findElement(By.id("lname")), pu.readProperty("lname"));
		au.typeIn(driver.findElement(By.id("email")), pu.readProperty("email"));
		au.typeIn(driver.findElement(By.xpath(pu.readProperty("add"))), " ");
		au.typeIn(driver.findElement(By.id("telephoneno")), pu.readProperty("mobileno"));
	}
	
	public void addUser_invalid_email() {
		au=new ActionUtils();
		au.click(driver.findElement(By.xpath(pu.readProperty("Adduser"))));
		au.click(driver.findElement(By.xpath(pu.readProperty("Chkbutn"))));
		au.typeIn(driver.findElement(By.id("fname")), pu.readProperty("fname"));
		au.typeIn(driver.findElement(By.id("lname")), pu.readProperty("lname"));
		au.typeIn(driver.findElement(By.id("email")), pu.readProperty("invalid_email"));
		au.typeIn(driver.findElement(By.xpath(pu.readProperty("add"))), pu.readProperty("Address"));
		au.typeIn(driver.findElement(By.id("telephoneno")), pu.readProperty("mobileno"));
		au.click(driver.findElement(By.xpath(pu.readProperty("submit"))));
	}
	
	public void screenShot(String Name) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\Gourav\\Pictures./Screenshots/"+Name+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
