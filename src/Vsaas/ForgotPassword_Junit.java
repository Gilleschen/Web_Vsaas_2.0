package Vsaas;

import static org.junit.Assert.*;

import org.junit.Test;

public class ForgotPassword_Junit {
	ForgotPassword_TestCase testcase = new ForgotPassword_TestCase();

	@Test
	public void ForgotPassword_AllBlank() {
		assertTrue(testcase.ForgotPassword_AllBlank());
	}

	@Test
	public void ForgotPassword_InvalideEmail() {
		assertTrue(testcase.ForgotPassword_InvalideEmail());
	}

}
