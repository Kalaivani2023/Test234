package facebook.execution;

import org.testng.annotations.Test;

import practice.testng.two.FaceBookTwo;
import traning.jan.project.BaseClass;

public class ExectionRun extends BaseClass {
	//FaceBookTwo ft = new FaceBookTwo();
	@Test
	public void loginExceution() {
		FaceBookTwo.loginPageValid();
	}

}
