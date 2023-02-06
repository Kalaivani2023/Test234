package file.read.writ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyReadWrite {

	public static void readFile() throws IOException {
		String location = "C:\\Users\\Admin\\Oct(Selenium) & Dec(Project)\\MavenProject\\src\\test\\resources\\TestData\\file.properties";
		
		FileReader read = new FileReader(location);
		
		Properties prop = new Properties();
		prop.load(read);
		String user = prop.getProperty("Username1");
		String pwd = prop.getProperty("Password1");
		System.out.println(user+" "+pwd);
	}
	public static void writeFile() throws IOException {
		String location = "C:\\Users\\Admin\\Oct(Selenium) & Dec(Project)\\MavenProject\\src\\test\\resources\\TestData\\file.properties";

		FileWriter write = new FileWriter(location);
		Properties prop = new Properties();
		prop.setProperty("CC_Number", "4444333322221111");
		prop.setProperty("CVV", "856");
		prop.store(write, "File Write done");
	}
	public static void main(String[] args) throws IOException {
		//readFile();
		writeFile();
	}
}
