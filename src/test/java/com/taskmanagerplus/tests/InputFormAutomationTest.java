package com.taskmanagerplus.tests;

import org.junit.jupiter.api.Test;

import com.taskmanagerplus.config.ConfigReader;
import com.taskmanagerplus.pages.AutomationPage;
import com.taskmanagerplus.pages.InitialPage;
import com.taskmanagerplus.pages.InputFormAutomationPage;

/**
 * 
 * Author: Maicon Fang Date: 2024-08-27 Version: 1.0
 */

public class InputFormAutomationTest extends BaseTest {

	@Test
	public void shouldFillNameAndSubmitFormTest() throws InterruptedException {
		
		driver.get(ConfigReader.getProperty("urlPublicHome"));
		
		InitialPage initialPage = new InitialPage(driver);
		AutomationPage automationPage = new AutomationPage(driver);
		InputFormAutomationPage inputForm = new InputFormAutomationPage(driver);

		Thread.sleep(1000);
		initialPage.clickAutomationMenu();

		Thread.sleep(1000);
		 automationPage.clickLinkInputForm();
		// automationPage.clickLinkInputFormByLinkText();
		// automationPage.clickLinkInputFormByPartialLinkText();
		
		
		Thread.sleep(1000);
		inputForm.enterInputName("I love figs");

		Thread.sleep(1000);
		inputForm.clickBtnSave();
		
		Thread.sleep(3000);

//		String expectedValue = "Model: \"New Brunswick\"";
//		String actualValue = typeahead.getValueTypeaheadDisplay();
//
//		Thread.sleep(1000);
//		Assertions.assertEquals(expectedValue, actualValue,
//				"The information was successfully displayed on the screen after typing.");
	}

}
