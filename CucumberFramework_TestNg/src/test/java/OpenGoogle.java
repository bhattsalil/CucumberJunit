
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

  public static void main(String[] args) {
    // Set the path to the ChromeDriver executable
	  System.setProperty("webdriver.chrome.driver","/Users/salil/Documents/chromedriver");

    // Create a new ChromeDriver instance
    WebDriver driver = new ChromeDriver();

    // Navigate to Google
    driver.get("https://www.google.com");

    // Close the browser
    driver.quit();
  }

}

