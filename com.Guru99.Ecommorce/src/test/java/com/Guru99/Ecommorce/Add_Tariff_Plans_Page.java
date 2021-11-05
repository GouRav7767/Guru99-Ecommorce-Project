package com.Guru99.Ecommorce;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Guru99.Listner.Listner_Ex;
import com.Guru99.Pages.BaseClass_2;



@Listeners(Listner_Ex.class)
public class Add_Tariff_Plans_Page extends BaseClass_2 {

	@Test
	public void verify_add_tariff_plan() {
		pu.readProperty("browser");

		add_Tariff_Plan();

		String Result = driver.findElement(By.tagName("h2")).getText();

		String Actual = "Congratulation you add Tariff Plan";

		if (Result.equals(Actual)) {
			screenShot(Actual);
			Assert.assertEquals(Result, Actual);

		}
	}

	@Test
	public void verify_add_tariff_plan_missInfo() {
		add_Tariff_Plan_missinfo();

		String alt = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String Text = "please fill all fields Correct Value";
		Assert.assertEquals(alt, Text);
		screenShot(Text);
	}

	@Test
	public void verify_add_tariff_plan_missInfo1() {
		add_Tariff_Plan_missinfo1();
		driver.switchTo().alert().accept();
		String abc="Testcasefailed";
		String Text = "Number must not be blank";
		String Error = driver.findElement(By.xpath("//label[text()='Number must not be blank']")).getText();
		if(Text.contentEquals(Error)) {
			System.out.println("Test Case is passed:");
			screenShot(Error);
		}else{
			System.out.println("Test Case is failed:");
			screenShot(abc);
		}
		
	}

	@Test
	public void verify_add_tariff_plan_wronginfo() {
		add_Tariff_Plan_wronginfo2();
		driver.switchTo().alert().accept();
		String Text = "Characters are not allowed";
		String Error = driver.findElement(By.id("message8")).getText();
		Assert.assertEquals(Error, Text);
		screenShot(Error);
	}

}
