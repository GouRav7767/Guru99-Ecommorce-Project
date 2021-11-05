package com.Guru99.Pages;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

import com.Guru99.Utility.ActionUtils;

public class BaseClass_2 extends BaseClass {
	 ActionUtils au1 =new ActionUtils();
	 
	public void add_Tariff_Plan() {
		au1.click(driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")));
		au1.typeIn(driver.findElement(By.id("rental1")), "500");
		au1.typeIn(driver.findElement(By.id("local_minutes")), "1000");
		au1.typeIn(driver.findElement(By.id("inter_minutes")), "1000");
		au1.typeIn(driver.findElement(By.id("sms_pack")), "500");
		au1.typeIn(driver.findElement(By.id("minutes_charges")), "1");
		au1.typeIn(driver.findElement(By.id("inter_charges")), "5");
		au1.typeIn(driver.findElement(By.id("sms_charges")), "1");
		au1.click(driver.findElement(By.xpath("//input[@type=\"submit\"]")));
	}
	
	
	public void add_Tariff_Plan_missinfo() {
		au1.click(driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")));
		au1.typeIn(driver.findElement(By.id("rental1")), " ");
		au1.typeIn(driver.findElement(By.id("local_minutes")), "1000");
		au1.typeIn(driver.findElement(By.id("inter_minutes")), "1000");
		au1.typeIn(driver.findElement(By.id("sms_pack")), "500");
		au1.typeIn(driver.findElement(By.id("minutes_charges")), "1");
		au1.typeIn(driver.findElement(By.id("inter_charges")), "5");
		au1.typeIn(driver.findElement(By.id("sms_charges")), "1");
		au1.click(driver.findElement(By.xpath("//input[@type=\"submit\"]")));
	}
	
	public void add_Tariff_Plan_missinfo1() {
		au1.click(driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")));
		au1.typeIn(driver.findElement(By.id("rental1")), "500 ");
		au1.typeIn(driver.findElement(By.id("local_minutes")), "1000");
		au1.typeIn(driver.findElement(By.id("inter_minutes")), "1000");
		au1.typeIn(driver.findElement(By.id("sms_pack")), "500");
		au1.typeIn(driver.findElement(By.id("minutes_charges")), "1");
		au1.typeIn(driver.findElement(By.id("inter_charges")), "5");
		au1.typeIn(driver.findElement(By.id("sms_charges")), " ");
		au1.click(driver.findElement(By.xpath("//input[@type=\"submit\"]")));
	}
	
	public void add_Tariff_Plan_wronginfo2() {
		au1.click(driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")));
		au1.typeIn(driver.findElement(By.id("rental1")), "abc");
		au1.typeIn(driver.findElement(By.id("local_minutes")), "abc");
		au1.typeIn(driver.findElement(By.id("inter_minutes")), "abc");
		au1.typeIn(driver.findElement(By.id("sms_pack")), "abc");
		au1.typeIn(driver.findElement(By.id("minutes_charges")), "abc");
		au1.typeIn(driver.findElement(By.id("inter_charges")), "abc");
		au1.typeIn(driver.findElement(By.id("sms_charges")), "abc");
		au1.click(driver.findElement(By.xpath("//input[@type=\"submit\"]")));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
