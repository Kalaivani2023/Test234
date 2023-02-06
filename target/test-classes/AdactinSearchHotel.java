package com.test.junit;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.utils.BaseClass;

public class AdactinSearchHotel extends BaseClass {
	
@Test
public void AdactinSearch() throws IOException {
    WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
    Select s = new Select(location);
    s.selectByVisibleText(readData("C:\\Users\\parth\\Project\\MavenSampleProgram\\src\\test\\resources\\Data\\ExcelData.xlsx", 0, 2, 1));
    WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
    Selecttext(hotel, readData("C:\\Users\\parth\\Project\\MavenSampleProgram\\src\\test\\resources\\Data\\ExcelData.xlsx", 0, 3, 1));
    WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
    Selecttext(roomtype, readData("C:\\Users\\parth\\Project\\MavenSampleProgram\\src\\test\\resources\\Data\\ExcelData.xlsx", 0, 4, 1));
    WebElement npofrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
    Selecttext(npofrooms, readData("C:\\Users\\parth\\Project\\MavenSampleProgram\\src\\test\\resources\\Data\\ExcelData.xlsx", 0, 5, 1));
    WebElement checkdate = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
   checkdate.sendKeys(readData("C:\\Users\\parth\\Project\\MavenSampleProgram\\src\\test\\resources\\Data\\ExcelData.xlsx", 0, 6, 1));
   WebElement checkout = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
   checkout.sendKeys(readData("C:\\Users\\parth\\Project\\MavenSampleProgram\\src\\test\\resources\\Data\\ExcelData.xlsx", 0, 7, 1));
    WebElement AdultsperRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
    Selecttext(AdultsperRoom,readData("C:\\Users\\parth\\Project\\MavenSampleProgram\\src\\test\\resources\\Data\\ExcelData.xlsx", 0, 8, 1));
    WebElement Children = driver.findElement(By.xpath("//select[@id='child_room']"));
   Selecttext(Children, readData("C:\\Users\\parth\\Project\\MavenSampleProgram\\src\\test\\resources\\Data\\ExcelData.xlsx", 0, 9, 1));
    WebElement Search = driver.findElement(By.xpath("//input[@name='Submit']"));
    Search.click();
}
}
