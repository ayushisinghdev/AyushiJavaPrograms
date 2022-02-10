package configFiles;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// set the path of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"/home/ayushi/Downloads/chromedriver_linux64/chromedriver");
		// Starting browser
		WebDriver driver = new ChromeDriver();
		// enter url
		driver.get("https://arintra.com/");
		String title = driver.getTitle();
		System.out.println(title);
		// Verify if title is correct
		if (title
				.equals("Automated Clinical Documentation | Autonomous Coding")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Wrong title");
		}
	}

}
