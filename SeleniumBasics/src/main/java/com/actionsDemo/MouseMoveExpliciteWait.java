package com.actionsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMoveExpliciteWait {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver85.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		WebElement Home = driver.findElement(By.xpath("//a[text()='Flights']"));

		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(Home).click().build();
		mouseOverHome.perform();

		Thread.sleep(5000);

		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.elementToBeClickable(Home));
		 */

	}
}
