package com.taskmanagerplus.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.taskmanagerplus.config.ConfigReader;
import com.taskmanagerplus.pages.AutomationPage;
import com.taskmanagerplus.pages.InitialPage;
import com.taskmanagerplus.pages.TypeaheadAutomationPage;

/**
 * 
 * Author: Maicon Fang Date: 2024-08-27 Version: 1.0
 */

public class AutomationTest extends BaseTest {

	@Test
	public void shouldDisplayCorrectModelValue() throws InterruptedException {
		
		driver.get(ConfigReader.getProperty("urlPublicHome"));
		
		InitialPage initialPage = new InitialPage(driver);
		AutomationPage automationPage = new AutomationPage(driver);
		TypeaheadAutomationPage typeahead = new TypeaheadAutomationPage(driver);

		Thread.sleep(1000);
		initialPage.clickAutomationMenu();

		Thread.sleep(1000);
		automationPage.clickLinkTypeahead();
		
		Thread.sleep(1000);
		typeahead.enterTypeaheadInput("New Brunswick");

		Thread.sleep(1000);
		typeahead.clickTypeaheadTitle();

		String expectedValue = "Model: \"New Brunswick\"";
		String actualValue = typeahead.getValueTypeaheadDisplay();

		Thread.sleep(1000);
		Assertions.assertEquals(expectedValue, actualValue,
				"The information was successfully displayed on the screen after typing.");
	}

}
