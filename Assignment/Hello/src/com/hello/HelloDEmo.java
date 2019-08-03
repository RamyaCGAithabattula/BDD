package com.hello;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HelloDEmo {
		public static void main(String[] args) throws InterruptedException {
			String path = "D:\\Spring-cg\\chromedriver_win32\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver",path);
			WebDriver driver= new ChromeDriver();
			driver.get("D:\\html\\hello.html");
			//WebElement element=driver.findElement(By.id("name"));
			//element.sendKeys("Hello All");	
		}
}
