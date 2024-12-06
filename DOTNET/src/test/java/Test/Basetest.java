package Test;

import org.testng.annotations.Test;
import Pages.Basepage;
import Pages.HomePage;

public class Basetest {

	@Test
	public void ValidateBasetest() throws InterruptedException {
		Basepage basepage = new Basepage();
		basepage.setup();

		HomePage homepage = new HomePage(basepage.driver);
		homepage.VerifyUserIsAbletoSubmitCredentials();
	}
}
