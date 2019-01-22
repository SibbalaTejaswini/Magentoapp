package com.abc.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
    By email=By.id("email");
    By pass=By.id("pwd");
    By login=By.id("send2");
	public Login(WebDriver driver) {
		super();
		this.driver = driver;
		
	}
    
    public void typeEmail(String username) 
    {
		driver.findElement(email).sendKeys(username);
	}
    public void typePass(String pwd) {
   	 driver.findElement(pass).sendKeys(pwd);
		
	}
    public void Clickonlogin() 
    {
   	 driver.findElement(login).click();
		
	}




}
