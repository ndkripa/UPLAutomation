package com.upl.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UPLExecutorLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://194.195.119.204:3000/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("executor");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("executor123@upl");
		driver.findElement(By.xpath("//button[@aria-label='toggle password visibility']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[contains(@id, 'rcc-confirm-button')]")).click();
	}

}
