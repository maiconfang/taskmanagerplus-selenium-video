package com.taskmanagerplus.tests;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.taskmanagerplus.drivers.DriverFactory;

/**
* 
 * Author: Maicon Fang
 * Date: 2024-08-28
 * Version: 1.0
 */

public class BaseTest {
    public WebDriver driver;
    protected WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        // Initialize the WebDriver
    	
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }
    
    
}
