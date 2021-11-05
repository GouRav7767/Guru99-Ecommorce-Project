package com.Guru99.Ecommorce;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Guru99.Pages.BaseClass3;

public class Pay_Billing_Page extends BaseClass3 {

	@Test
	public void check_valid_billing_id() {
		pay_billing();

		String Bill_id = driver.findElement(By.xpath("//h3")).getText();

		if (Bill_id.contains("594084")) {
			System.out.println("Test Case is passed:");
			screenShot("Passsed");
		} else {
			System.out.println("Test case is failed: ");
			screenShot("Error in bill id");
		}

	}
	
	@Test
	public void check_invalid_billing_id() {
		pay_billing_invalid();
		
		String Error = "Please Input Your Correct Customer ID";
		String act = driver.findElement(By.tagName("h4")).getText();
		if(act.equals(Error)) {
			System.out.println("Test Case is passed:");
			screenShot("Test case is passed");
		}
		 else {
				System.out.println("Test case is failed: ");
				screenShot("Error in bill id");
			}

		

	}

}
