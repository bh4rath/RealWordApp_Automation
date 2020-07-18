package ui_tests;

import org.testng.annotations.Test;

import base.BaseTest;
import webpages.SignUpPage;
import webpages.SigninPage;

public class TestSignUp extends BaseTest {
	
	@Test
	public void testSignUp() {
		signinPage.clickSignupLink();
		SignUpPage signupPage = signinPage.clickSignupLink();
		SigninPage signinPage = signupPage.signUp("Bharath", "Selvam", "bugCatcher", "admin", "admin");
		signinPage.signin("bugCatcher", "admin");
		
	}
}