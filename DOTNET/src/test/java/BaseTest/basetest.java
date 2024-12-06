package BaseTest;

import org.testng.annotations.Test;

import NewPages.BasePage;

public class basetest {
	@Test
	public void ValidateBasetest() {
		BasePage basepage = new BasePage();
		basepage.LaunchApplication();
	}

}
