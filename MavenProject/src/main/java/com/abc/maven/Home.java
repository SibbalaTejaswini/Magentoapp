package com.abc.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	WebDriver driver;
	By myacc=By.linkText("My Account");

	public Home(WebDriver driver) {
		this.driver = driver;
	}
	public void ClickonMyacc() {
		driver.findElement(myacc).click();

	}
}
