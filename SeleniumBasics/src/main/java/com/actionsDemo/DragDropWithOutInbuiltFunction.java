package com.actionsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropWithOutInbuiltFunction {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "chromedriver85.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    WebElement from=driver.findElement(By.xpath("//a[text()=' BANK ']"));
    WebElement to=driver.findElement(By.xpath("//ol[@id='bank']/li"));
    Thread.sleep(3000);
    Actions action=new Actions(driver);
    action.moveToElement(from).clickAndHold().release(to).build().perform();
    Thread.sleep(3000);
}
}
