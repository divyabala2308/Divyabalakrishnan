package org.bases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basess {
	
		public static WebDriver driver;
		
		public static WebDriver ChromeBrowser() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			return driver;
			}
		
		public static WebDriver FirefoxBrowser() {
			WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
				 
				 return driver;
				}
		public static WebDriver edgebrowser() {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			 
			 return driver;
			}
		
		public static WebDriver Browserlaunch(String Browser) {
		
		switch(Browser) {
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		break;
		
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			break;
		}
		return driver;
		
	}
	  

	//url Launch
	   public static void urllaunch(String url) {
		driver.get(url);
	}
	   //sendkeys
	   public static void sendkeys(WebElement e,String value) {
		  	e.sendKeys(value);
			
	   }
		  	
		  	//click
	   public static void click(WebElement e) {
		   e.click(); 

	}
	   
	   //current url
	   public static void currenturl(String url) {
		driver.getCurrentUrl();

	}
	   
	   //time
	   public static void time(int secs) {
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
		   
	   }
	   //maximize
	   public static void maximize() {
		driver.manage().window().maximize();
		
	}
	   
	   //quit
	   public static void quit() {
		driver.quit();
	}
	   
	   //title
	   public static String title() {
		String title = driver.getTitle();
		return title; 
	}
	   //getatribute
	   public static String getatribute(WebElement e) {
		   String get=e.getAttribute("value");
		return get;
	}
	   //get text
	   public static String gettext(WebElement e) {
		   String text = e.getText();
		return text;	

	}
	   //movetoelement
	   public static void moveToElement(WebElement e) {
		   Actions a=new Actions(driver);
		   a.moveToElement(e).perform();
		

	}
	   //dropdown
	   
	   
	   public static void dropdownlocation(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);	

	   }
	   
	   public static void dropdownromm(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
			
		   }
	   
	   public static void dropdownroomno(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
			
		   }
	   
	   public static void dropdownhotel(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
			
		   }
	   
	   
	   public static void dropdownadult(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
			
		   }
	   
	   public static void dropdownchildren(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
			
		   }
	   public static void dropdowncardtype(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
			
		   }
	   
	   public static void dropdownexpirymnth(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
			
		   }
	   
	   public static void dropdownexpiryyear(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
			
		   }
	   
	   public static void dropdowncvv(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
			
		   }
	}

	 

	   



