package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v117.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class robotclass {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub)
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		WebElement textbox=dr.findElement(By.id("userName"));
		textbox.sendKeys("I am Nikita");
		Thread.sleep(2000);
		textbox.clear();
		Thread.sleep(2000);
		
		Actions a=new Actions(dr);
		WebElement text=dr.findElement(By.id("userName"));
		
		a.keyDown(Keys.SHIFT).build().perform();
		text.sendKeys("C");
		Thread.sleep(2000);
		
		a.keyUp(Keys.SHIFT).build().perform();
		text.sendKeys("Selenium");
		Thread.sleep(2000);
		
		a.keyDown(Keys.SHIFT).build().perform();
		text.sendKeys("Selenium 456677");
		Thread.sleep(2000);
		
		
		dr.close();

}
}