package login.Junit;

import java.io.IOException;

import org.junit.Test;

import adactin.login.page.locatpr.AdactinLoginPageLocator;

public class LoginPageTest {
@Test
public void adactinLogin() throws IOException {
	AdactinLoginPageLocator.loginWithValidCredentials();
	
}
}
