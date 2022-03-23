import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Parmeet");
		alert.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(20000);
		driver.close();
	}

}
