package com.actionsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver85.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement Element=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    Thread.sleep(3000);
	    Actions action=new Actions(driver);
	    action.doubleClick(Element).perform();
	    Thread.sleep(3000);	
		Alert alert =driver.switchTo().alert();
		System.out.println("get text"+alert.getText());
		alert.accept();
		

}
}
