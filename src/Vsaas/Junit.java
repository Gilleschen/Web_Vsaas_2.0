package Vsaas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Vsaas.TestCase;

public class Junit {
	TestCase testcase = new TestCase();

	@Test
	public void test() {
		assertTrue(testcase.Login_Z());
	}

}
