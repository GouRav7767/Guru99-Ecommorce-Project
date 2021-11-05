package com.Guru99.Ecommorce;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Guru99.Pages.BaseClass3;

public class Add_tariff_Plan_To_Customer extends BaseClass3 {

	@Test
	public void valid_Tariff_Plan() {
		pu.readProperty("browser");
		add_tariff_Plan();

		String Text = driver.findElement(By.xpath("//h2[text()='Congratulation Tariff Plan assigned']")).getText();
		String Act = "Congratulation Tariff Plan assigned";

		if (Text.equals(Act)) {
			System.out.println("TestCase is passed");
			screenShot(Act);
		} else {
			System.out.println("TestCase is Failed");
		}
		driver.close();
	}

	
	@Test
	public void invalid_Tariff_Plan() {

		pu.readProperty("browser");
		wrong_Tariff_Plan();
		String Error = driver.findElement(By.xpath("//h4")).getText();
		String ErrText = "Please Input Your Correct Customer ID";

		if (Error.equals(ErrText)) {
			System.out.println("TestCase is passed");
			screenShot(Error);
		} else {
			System.out.println("TestCase is Failed");
		}
		driver.close();

	}

}