/**
 * 
 */
package com.pontiflex.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * @author reaz
 *
 */
public class WebDriverWrapper {
	
	static WebDriver driver;
	
	public void type(String loc, String tVal){
		driver.findElement(By.id(loc)).clear();
		driver.findElement(By.id(loc)).sendKeys(tVal);
	}
	public void check(String loc){
		driver.findElement(By.id(loc)).click();
	}
	public void click(String loc){
		driver.findElement(By.cssSelector(loc)).click();
	}
	
	public void selectByVisibleText(String locator, String option) {
		WebElement dropDownListBox = driver.findElement(By.id(locator));
		Select clickThis = new Select(dropDownListBox);
		clickThis.selectByVisibleText(option);
    }
	 /**
     * Blocks next statement until text is present
     * Blocking period is 1 minute
     *
     * @param text
     */
    public void waitForTextPresent(String text) {
        for (int i = 0; i < 15; i++) {
            if (isTextPresent(text)) {
                break;
            } else {
                pause(1000);
            }
        }
    }
    
    public boolean isTextPresent(String text) {
        boolean isTextPresent = false;
        int i = 1;
        while (i < 30) {
            try {
                isTextPresent = driver.findElement(By.tagName("body")).getText().contains(text);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                pause(1000);
            }
            ++i;
        }
        return isTextPresent;
    }

    public void pause(int millisecs) {
        try {
            Thread.sleep(millisecs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
