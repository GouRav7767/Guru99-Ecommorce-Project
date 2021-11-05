package com.Guru99.Ecommorce;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Guru99.Listner.Listner_Ex;
import com.Guru99.Pages.BaseClass;


@Parameters("browser")
@Listeners(Listner_Ex.class)
public class HomePage extends BaseClass {

	@Test(priority = 1)
	public void dashboard_Check() {
		pu.readProperty("browser");
		Assert.assertEquals(driver.getTitle(), "Guru99 Telecom");
	}

	@Test(priority = 2, dependsOnMethods = "dashboard_Check")
	public void add_user_test() {
		addUser();
		String Text = driver.findElement(By.tagName("h1")).getText();
		String Act = "Access Details to Guru99 Telecom";
		if (Text.equals(Act)) {
			System.out.println(1);
			screenShot(Text);
		}

	}

	@Test(priority = 3)
	public void missing_info_adduser() {
		pu.readProperty("browser");

		addUser_Missing_Credentials();

		au.click(driver.findElement(By.xpath(pu.readProperty("submit"))));

		Alert alt = driver.switchTo().alert();

		String Alert = alt.getText();

		String Actual = "please fill all fields";

		if (Alert.equals(Actual)) {
			System.out.println(Alert);
			// To take screenshot

			Assert.assertEquals(Alert, Actual);

			System.out.println("Test Case is Passed");

		}

		alt.accept();

	}

	@Test
	public void verify_Invalid_email() {
		pu.readProperty("browser");

		addUser_invalid_email();

		String Err = driver.findElement(By.id("message9")).getText();

		String ActEr = "Email-ID is not valid";

		if (Err.equals(ActEr)) {
			screenShot(ActEr);
		}
		driver.close();
	}

	@Test
	public void Missing_info_alert() {
		pu.readProperty("browser");

		addUser_Missing_Credentials();

		String Error = driver.findElement(By.xpath(pu.readProperty("BlnakAdd"))).getText();

		String Exp = "Address Field must not be blank";

		if (Error.equals(Exp)) {
			System.out.println(1);
			screenShot(Error);

		}

	}

}
