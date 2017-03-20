package Vsaas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Vsaas.Login_TestCase;

public class Login_Junit {
	Login_TestCase testcase = new Login_TestCase();

	@Test
	public void Login_Z() {
		assertTrue(testcase.Login_Z());
	}
	
	@Test
	public void Login_WrongPassword(){
		
		assertTrue(testcase.Login_WrongPassword());
	}
	@Test
	public void Login_ALLBlank_Email(){
		assertTrue(testcase.Login_ALLBlank_Email());
	}
	@Test
	public void Login_AllBlank_Password(){
		
		assertTrue(testcase.Login_AllBlank_Password());
		
	}
	@Test
	public void Login_InvalideMail(){
		assertTrue(testcase.Login_InvalideMail());
	}
	@Test
	public void Login_WrongPassword_rule(){
		assertTrue(testcase.Login_WrongPassword_rule());
	}

}
