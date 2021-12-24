package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
	static WebDriver driver;

	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void openApplication(String string) {
		driver.get(string);
		return;
	}

	public static void facebook() {

		// driver.findElement(By.id("input")).sendKeys("https://www.facebook.com/");
		driver.findElement(By.name("q")).sendKeys("https://www.facebook.com/");// method first
		driver.findElement(By.className("gNO89b")).click();//
		// driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();

	}

	public static void handleWebElement() {

		// driver.findElement(By.id("input")).sendKeys("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9763192201");

		driver.findElement(By.name("pass")).sendKeys("satishpatil");
		driver.findElement(By.name("login")).click();

	}

	public static void main(String[] args) {
		launchbrowser();
		// openApplication("https://www.google.co.in/");
		// facebook();
		openApplication("https://www.facebook.com/");

		handleWebElement();

	}

}
