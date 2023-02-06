package traning.jan.project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropReadLoginValid {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		String location = "C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\proj.properties";
		
		FileReader read = new FileReader(location);
		Properties prop = new Properties();
		prop.load(read);
		String user = prop.getProperty("Username1");
		String pwd = prop.getProperty("Password");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pwd);
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
	
	}

}
