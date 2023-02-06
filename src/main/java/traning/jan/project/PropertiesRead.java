package traning.jan.project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesRead {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/Register.php");
		driver.manage().window().maximize();
		
	String location = "C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\proj.properties";
	
		FileReader fileread = new FileReader(location);
		Properties prop = new Properties ();
		prop.load(fileread);
		String user = prop.getProperty("Username");
		String pwd = prop.getProperty("Password");
		String conpwd = prop.getProperty("ConfirmPassword");
		String name = prop.getProperty("FullName");
		String mail = prop.getProperty("Email");
		System.out.println(user+" "+pwd);
	
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pwd);
		WebElement confirmPwd = driver.findElement(By.xpath("//input[@id='re_password']"));
		confirmPwd.sendKeys(conpwd);
		WebElement fullName = driver.findElement(By.xpath("//input[@id='full_name']"));
		fullName.sendKeys(name);
		WebElement email = driver.findElement(By.xpath("//input[@id='email_add']"));
		email.sendKeys(mail);
	}
	
	

}

