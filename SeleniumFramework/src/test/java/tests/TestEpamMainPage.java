package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEpamMainPage {

	public static void main(String[] args) {

		EpamMainPage();
	}
	public static void EpamMainPage() {
	
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", projectPath+"/drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//goto epamMainPage
		driver.get("https://www.epam.com");
		
		//click on apply cookies
		driver.findElement(By.className("button__content")).click();

		//click on contact us
		driver.findElement(By.className("cta-button__text")).click();
		
		//close browser
		driver.close();
		
		System.out.println("Test completed Successfully");
		
	}

}
