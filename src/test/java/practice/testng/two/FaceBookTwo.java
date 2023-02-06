package practice.testng.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import practice.testng.FacebookLoginone;
import traning.jan.project.BaseClass;

@SuppressWarnings("unused")
public class FaceBookTwo extends BaseClass {
	FacebookLoginone lp = new FacebookLoginone();	
	public static void loginPageValid() {
		try {
		browserLaunch("chrome");
		launchUrl("https://www.facebook.com/");
//		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
//		user.sendKeys("karkalaivani88@gmail.com");
//				
		dataSend(new FacebookLoginone().getId(), "karkalaivani88@gmail.com");
		dataSend(new FacebookLoginone().getPass(),"Revathi@1506");
		click(new FacebookLoginone().getLogin());
	} catch (Exception e) {System.out.println(e.getMessage());

}
	}
}
