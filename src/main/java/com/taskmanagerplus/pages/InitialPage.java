package com.taskmanagerplus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page object class for the initial page in the Task Manager Plus application.
 * 
 * <p>This class provides methods to interact with and verify elements on the 
 * initial page, including navigation links and the system name element.</p>
 * 
 * 
 * <p><b>Note:</b> This class should be used to encapsulate the interactions 
 * with the initial page elements, ensuring that tests remain clean and maintainable.</p>
 * 
 * Author: Maicon Fang
 * Date: 2024-07-09
 * Version: 1.0
 */

public class InitialPage {
    WebDriver driver;

    @FindBy(id = "navbar_automation_link") // ID of the "Automation" link in the menu
    WebElement navLinkAutomation;


    /**
     * Constructor to initialize the WebDriver and page elements.
     * 
     * <p>This constructor sets the WebDriver instance and initializes the web 
     * elements using the PageFactory.</p>
     * 
     * @param driver the WebDriver instance to be used by this page object
     */
    public InitialPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Clicks the automation link in the navigation menu.
     */
    public void clickAutomationMenu() {
    	navLinkAutomation.click();
    }
    
    /**
     * Verifies if the "Automation" link is present in the navigation menu.
     * 
     * @return {@code true} if the "Automation" link is displayed, otherwise {@code false}
     */
    public boolean isNavLinkAutomationPresent() {
        return navLinkAutomation.isDisplayed();
    }


}
