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
public class AutomationPage {
    WebDriver driver;

    @FindBy(id = "automation-link-typeahead")
    WebElement linkTypeahead;
    
    @FindBy(id = "automation-link-input-form")
    WebElement linkInputForm;
    
    @FindBy(linkText = "Input Form")
    WebElement linkInputFormByLinkText;
    
    @FindBy(partialLinkText = "Input")
    private WebElement linkInputFormByPartialLinkText;

    
    /**
     * Constructor to initialize the WebDriver and page elements.
     * 
     * <p>This constructor sets the WebDriver instance and initializes the web 
     * elements using the PageFactory.</p>
     * 
     * @param driver the WebDriver instance to be used by this page object
     */
    public AutomationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLinkTypeahead() {
    	linkTypeahead.click();
    }
    
    public void clickLinkInputForm() {
    	linkInputForm.click();
    }
    
    public void clickLinkInputFormByLinkText() {
    	linkInputFormByLinkText.click();
    }
    
    public void clickLinkInputFormByPartialLinkText() {
    	linkInputFormByPartialLinkText.click();
    }
    
    
}
