package adactin.login.page.locatpr;

import adactin.login.LoginAdactin1;
import traning.jan.project.BaseClass;

public class AdactinLoginPageLocator extends BaseClass {
	
	public static void loginWithValidCredentials () {
		try {
			browserLaunch("chrome");
			launchUrl("https://adactinhotelapp.com/");
			senddata(new LoginAdactin1().getUser(), "kalaivanik");
			senddata(new LoginAdactin1().getPwd(), "Revathi@1506");
			click(new LoginAdactin1().getLogin());
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	}
