package com.Guru99.Pages;

import org.openqa.selenium.By;

import com.Guru99.Utility.ActionUtils;

public class BaseClass3 extends BaseClass_2 {
	ActionUtils au2 = new ActionUtils();

	public void add_tariff_Plan() {
		au2.click(driver.findElement(By.xpath("//h3//a[text()='Add Tariff Plan to Customer']")));
		au2.typeIn(driver.findElement(By.id("customer_id")), "594084");
		au2.click(driver.findElement(By.xpath("//input[@value=\"submit\"]")));
//		au2.click(driver.findElement(By.xpath("//label[@for=\"sele\"]")));
		au2.click(driver.findElement(By.xpath("//input[@type=\"submit\"]")));

	}

	public void wrong_Tariff_Plan() {
		au2.click(driver.findElement(By.xpath("//h3//a[text()='Add Tariff Plan to Customer']")));
		au2.typeIn(driver.findElement(By.id("customer_id")), "123456");
		au2.click(driver.findElement(By.xpath("//input[@value=\"submit\"]")));

	}

	public void pay_billing() {

		au2.click(driver.findElement(By.xpath("//a[text()='Pay Billing']")));
		au2.typeIn(driver.findElement(By.id("customer_id")), "594084");
		au2.click(driver.findElement(By.xpath("//input[@value=\"submit\"]")));

	}

	public void pay_billing_invalid() {

		au2.click(driver.findElement(By.xpath("//a[text()='Pay Billing']")));
		au2.typeIn(driver.findElement(By.id("customer_id")), "123456");
		au2.click(driver.findElement(By.xpath("//input[@value=\"submit\"]")));

	}

}
