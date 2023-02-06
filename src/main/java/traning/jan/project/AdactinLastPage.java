package traning.jan.project;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinLastPage extends BaseClass {
	@Test
	public void LastPage () {
	WebElement hotelClick = driver.findElement(By.xpath("//input[@type='radio']"));
	hotelClick.click();
	WebElement confirm = driver.findElement(By.xpath("//input[@type='submit']"));
	confirm.click();
	}
}
