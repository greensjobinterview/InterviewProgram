package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class SelSample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ACHU\\workspace\\Class\\FacebookAutomation\\driver\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tables.asp");
		WebElement table = driver.findElement(By.xpath("(//*[@class='table'])[2]"));
		List<WebElement> aR = table.findElements(By.tagName("tr"));
		// all row
		/*
		 * for (WebElement x : aR) { System.out.println(x.getText());
		 * 
		 * }
		 */

		for (WebElement x : aR) {
			List<WebElement> ac = x.findElements(By.tagName("td"));

			for (WebElement c : ac) {
				System.out.print(c.getText()+" ");
				
			}
			System.out.println();

		}

	}

}
