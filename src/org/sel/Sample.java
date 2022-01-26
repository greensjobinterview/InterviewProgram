package org.sel;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public static void main(String[] args) {
		
		Integer occCount = null;
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ACHU\\workspace\\Class\\FacebookAutomation\\driver\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://demo.wpjobboard.net/wp-admin/admin.php?page=wpjb-application");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
		driver.findElement(By.xpath("//*[text()='Jobs ']")).click();
		
		Map<String,Integer> companyOpenings = new LinkedHashMap<>();


		List<WebElement> companyNames= driver.findElements(By.xpath("//td[@data-colname='Company']"));
		for(WebElement x : companyNames){
		String name = x.getText();

		if(companyOpenings.containsKey(name)){

		 occCount=companyOpenings.get(name);
		companyOpenings.put(name,occCount+1);

		}
		else{

		companyOpenings.put(name,1);

		}

		}

		System.out.println(companyOpenings);
		
		}

		
}
