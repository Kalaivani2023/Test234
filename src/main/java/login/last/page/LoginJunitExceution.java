package login.last.page;

import org.junit.Test;

import login.locator.data.LocatorTwo;
import traning.jan.project.BaseClass;

public class LoginJunitExceution extends BaseClass {
	@Test
	public void Exection() {
		LocatorTwo.loginWithValidCredentials();
		
	}

}
