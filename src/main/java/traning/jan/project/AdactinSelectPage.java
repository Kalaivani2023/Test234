package traning.jan.project;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinSelectPage extends BaseClass {
	@Test
	public void AdactinHotelSearch () throws IOException, InterruptedException {
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select sel = new Select (location);
		sel.selectByVisibleText(readData("C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\Maven Read and Write.xlsx", 0, 2, 0));
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		hotels.sendKeys(readData("\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\Maven Read and Write.xlsx", 0, 3, 0));
		WebElement roomType = driver.findElement(By.xpath("//select[@name='room_type']"));
		roomType.sendKeys(readData("C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\Maven Read and Write.xlsx", 0, 4, 0));
		WebElement noOfRoom = driver.findElement(By.xpath("//select[@id='room_nos']"));
		noOfRoom.sendKeys(readData("C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\Maven Read and Write.xlsx", 0, 5, 0));
		WebElement checkInDate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		checkInDate.clear();
		checkInDate.sendKeys("22/01/2023");
		Thread.sleep(3000);
		WebElement checkOutDate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		checkOutDate.clear();
		checkOutDate.sendKeys("23/01/2023");
		Thread.sleep(3000);
		WebElement adultRoom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		adultRoom.sendKeys(readData("C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\Maven Read and Write.xlsx", 0, 8, 0));
		WebElement childRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
		childRoom.sendKeys(readData("C:\\Users\\EliteBook\\Workspace kk\\PracticeMaven\\src\\test\\resources\\Maven Read and Write.xlsx", 0, 9, 0));
		WebElement searc = driver.findElement(By.xpath("//input[@name='Submit']"));
		searc.click();
		
		
	}
	}