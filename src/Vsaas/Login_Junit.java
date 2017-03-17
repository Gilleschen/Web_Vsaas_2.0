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

}
