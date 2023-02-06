package login.locator.data;


import login.page.getter.LoginOne;
import traning.jan.project.BaseClass;

public class LocatorTwo extends BaseClass {
		
		public static void loginWithValidCredentials () {
			try {
				browserLaunch("chrome");
				launchUrl("https://adactinhotelapp.com/");
				senddata(new LoginOne().getUser(),"kalaianik");
				senddata(new LoginOne().getPwd(),"Revathi@1506");
				click(new LoginOne().getLogin());
			
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		}
