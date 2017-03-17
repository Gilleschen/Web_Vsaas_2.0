package Vsaas;

import java.awt.AWTException;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Vsaas.Platform;
import Vsaas.Platform;

public class Login_TestCase {

	Platform web = new Platform();
	int sec = 10;
	WebDriverWait[] wait = new WebDriverWait[web.driver.length];
	String element[] = new String[web.driver.length];
	public Login_TestCase() {
		for (int i = 0; i < web.driver.length; i++) {
			wait[i] = new WebDriverWait(web.driver[i], sec);
		}

	}

	public boolean Login_Z() {
		boolean result = false;
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < web.driver.length; i++) {
			Wait_Element("email", methodname, i);
			web.driver[i].findElement(By.name("email")).sendKeys("jhih_chen@sina.com");
			web.driver[i].findElement(By.name("password")).sendKeys("888888ii");
			web.driver[i].findElement(By.className("btn")).click();
		}
		for (int i = 0; i < web.driver.length; i++) {
			QuitDriver(i);
		}

		return result;
	}

	public boolean Login_ALLBlank() {

		boolean result = false;
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < web.driver.length; i++) {
			Wait_Element("email", methodname, i);
			web.driver[i].findElement(By.className("btn")).click();
			
		}
		return result;

	}

	public boolean Login_WrongPassword() {
		boolean result = false;
		String ans="±b¸¹©Î±K½X¿ù»~";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		for (int i = 0; i < web.driver.length; i++) {
			Wait_Element("email", methodname, i);
			web.driver[i].findElement(By.name("email")).sendKeys("jhih_chen@sina.com");
			web.driver[i].findElement(By.name("password")).sendKeys("12345678abcdefg");
			web.driver[i].findElement(By.className("btn")).click();
			element[i]=web.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.4']")).getText();
			System.out.println(element[i]);
		
		}
		for (int i = 0; i < web.driver.length; i++) {
			QuitDriver(i);
		}

		return result;
	}

	void Wait_Element(String element, String methodname, int i) {

		try {
			wait[i].until(ExpectedConditions.presenceOfElementLocated(By.name(element)));
		} catch (Exception ex) {

			System.out.println("MethodName:" + this.getClass().getName() + "." + methodname);
			System.out.println("Not found " + element);
		}

	}

	void QuitDriver(int i) {
		web.driver[i].quit();
	}
}
