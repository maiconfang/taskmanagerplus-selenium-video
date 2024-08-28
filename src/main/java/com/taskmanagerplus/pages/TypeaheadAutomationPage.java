package com.taskmanagerplus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**

 * Author: Maicon Fang
 * Date: 2024-08-27
 * Version: 1.0
 */
public class TypeaheadAutomationPage {
    WebDriver driver;

    @FindBy(id = "typeahead-automation-Input")
    WebElement inputTypeahead;
    
    @FindBy(id = "typeahead-automation-model-display")
    WebElement typeaheadDisplay;
    
    @FindBy(id = "typeahead-title")
    WebElement typeaheadTitle;

    
    /**
     * Constructor to initialize the WebDriver and page elements.
     * 
     * <p>This constructor sets the WebDriver instance and initializes the web 
     * elements using the PageFactory.</p>
     * 
     * @param driver the WebDriver instance to be used by this page object
     */
    public TypeaheadAutomationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterTypeaheadInput(String input) {
    	inputTypeahead.sendKeys(input);
    }
    
    
    public String getValueTypeaheadDisplay() {
    	return typeaheadDisplay.getText();
    }
    
    public void clickTypeaheadTitle() {
    	typeaheadTitle.click();
    }
    
}
