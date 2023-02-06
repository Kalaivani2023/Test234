package POM.sample;

import sample.org.BaseClass1;
import traning.jan.project.BaseClass;

public class Login extends BaseClass{
	public static void LoginInAdactin(){	
	try {
		browserLaunch("chrome");
		loadUrl("https://adactinhotelapp.com/");
		dataSend(new LoginElements().getuser(),"Nithya94");
		dataSend(new LoginElements().getPass(),"Sivanithya");
		click(new LoginElements().getLogin());
	
	}catch(Exception e){
		System.out.println(e.getMessage());
		
	}
}
}