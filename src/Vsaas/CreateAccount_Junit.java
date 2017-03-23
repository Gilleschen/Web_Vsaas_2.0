package Vsaas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreateAccount_Junit {
	CreateAccount_TestCase testcase = new CreateAccount_TestCase();

	@Test
	public void CreateAccount_ALLBlank() {
		assertTrue(testcase.CreateAccount_ALLBlank());
	}

	@Test
	public void CreateAccount_InvalideMail() {
		assertTrue(testcase.CreateAccount_InvalideMail());
	}

	@Test
	public void CreateAccount_InvalidePassword() {
		assertTrue(testcase.CreateAccount_InvalidePassword());
	}

	@Test
	public void CreateAccount_PasswordNotMatch() {
		assertTrue(testcase.CreateAccount_PasswordNotMatch());
	}
}
