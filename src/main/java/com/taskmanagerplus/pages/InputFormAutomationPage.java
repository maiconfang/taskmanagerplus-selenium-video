package com.taskmanagerplus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**

 * Author: Maicon Fang
 * Date: 2024-09-04
 * Version: 1.0
 */
public class InputFormAutomationPage {
    WebDriver driver;


    
    @FindBy(className = "just-test-using-in-selenium")
    WebElement inputNameByClassName;
    
    @FindBy(css = "input.form-control.just-test-using-in-selenium")
    WebElement inputNameByCss;
    
    @FindBy(how = How.ID, using = "input-form-automation-name")
    WebElement inputNameByHow;
    
    @FindBy(id = "input-form-automation-name")
    WebElement inputNameById;
   
    @FindBy(name = "input-name-attribute")
    WebElement inputNameByName;
   
    @FindBy(tagName = "input" )
    WebElement inputNameByTagName;
    
    @FindBy(using = "input-form-automation-name")
    WebElement inputNameByUsing;
    
    @FindBy(xpath = "//input[@id='input-form-automation-name']")
    private WebElement inputNameByXpath;

    
    
   // I am mapping both elements in the input form option of the AutomationPage class.
   // @FindBy(linkText = "Exact Link Text") 
   // WebElement inputNameByLinkText;

   // @FindBy(partialLinkText = "Partial Link Text") 
   // WebElement inputNameByPartialLinkText;

    
    @FindBy(id = "input-form-btn-save")
    WebElement btnSave;
    

    
    /**
     * Constructor to initialize the WebDriver and page elements.
     * 
     * <p>This constructor sets the WebDriver instance and initializes the web 
     * elements using the PageFactory.</p>
     * 
     * @param driver the WebDriver instance to be used by this page object
     */
    public InputFormAutomationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterInputName(String value) {
//    	inputNameById.sendKeys(value);
//    	inputNameByClassName.sendKeys(value);
//    	inputNameByCss.sendKeys(value);
//    	inputNameByHow.sendKeys(value);
//    	inputNameByName.sendKeys(value);
//    	inputNameByTagName.sendKeys(value);
//    	inputNameByUsing.sendKeys(value);
    	inputNameByXpath.sendKeys(value);
    	
    }
    
    
    public void clickBtnSave() {
    	btnSave.click();
    }
    
}
