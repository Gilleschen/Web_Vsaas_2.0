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
		String ans = "所有設備";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		boolean resultelement[] = new boolean[web.driver.length];
		for (int i = 0; i < web.driver.length; i++) {
			Wait_Element_ByName("email", methodname, i);
			web.driver[i].findElement(By.name("email")).sendKeys("jhih_chen@sina.com");
			web.driver[i].findElement(By.name("password")).sendKeys("888888ii");
			web.driver[i].findElement(By.className("btn")).click();
			Wait_Element_ByCSS("span[data-reactid='.0.1.0.0.1']", methodname, i);
			element[i] = web.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.0.1']")).getText();
		}
		for (int i = 0; i < web.driver.length; i++) {
			QuitDriver(i);
		}

		return result(resultelement, ans, methodname);

	}

	public boolean Login_ALLBlank_Email() {
		String ans = "請輸入您的電子郵件";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		boolean resultelement[] = new boolean[web.driver.length];
		for (int i = 0; i < web.driver.length; i++) {
			Wait_Element_ByName("email", methodname, i);
			web.driver[i].findElement(By.className("btn")).click();
			Wait_Element_ByCSS("span[data-reactid='.0.1.0.1.1']", methodname, i);
			element[i] = web.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.1.1']")).getText();

		}
		for (int i = 0; i < web.driver.length; i++) {
			QuitDriver(i);
		}
		return result(resultelement, ans, methodname);

	}

	public boolean Login_AllBlank_Password() {

		String ans = "請輸入您的密碼";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		boolean resultelement[] = new boolean[web.driver.length];
		for (int i = 0; i < web.driver.length; i++) {
			Wait_Element_ByName("email", methodname, i);
			web.driver[i].findElement(By.className("btn")).click();
			Wait_Element_ByCSS("span[data-reactid='.0.1.0.2.1']", methodname, i);
			element[i] = web.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).getText();

		}
		for (int i = 0; i < web.driver.length; i++) {
			QuitDriver(i);
		}
		return result(resultelement, ans, methodname);

	}

	public boolean Login_InvalideMail() {
		String ans = "電子郵件格式錯誤";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		boolean resultelement[] = new boolean[web.driver.length];
		for (int i = 0; i < web.driver.length; i++) {
			Wait_Element_ByName("email", methodname, i);
			web.driver[i].findElement(By.name("email")).sendKeys("jhih_chensina.com");
			web.driver[i].findElement(By.name("password")).sendKeys("888888ii");
			web.driver[i].findElement(By.className("btn")).click();
			Wait_Element_ByCSS("span[data-reactid='.0.1.0.1.1']", methodname, i);
			element[i] = web.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.1.1']")).getText();

		}
		for (int i = 0; i < web.driver.length; i++) {
			QuitDriver(i);
		}
		return result(resultelement, ans, methodname);
	}

	public boolean Login_WrongPassword_rule() {
		String ans = "請使用8到20個字元之間的字母和數字組合來建立密碼";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		boolean resultelement[] = new boolean[web.driver.length];
		for (int i = 0; i < web.driver.length; i++) {
			Wait_Element_ByName("email", methodname, i);
			web.driver[i].findElement(By.name("email")).sendKeys("jhih_chen@sina.com");
			web.driver[i].findElement(By.name("password")).sendKeys("8888888888");
			web.driver[i].findElement(By.className("btn")).click();
			Wait_Element_ByCSS("span[data-reactid='.0.1.0.2.1']", methodname, i);
			element[i] = web.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).getText();

		}
		for (int i = 0; i < web.driver.length; i++) {
			QuitDriver(i);
		}
		return result(resultelement, ans, methodname);
	}

	public boolean Login_WrongPassword() {
		String ans = "帳號或密碼錯誤";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		boolean resultelement[] = new boolean[web.driver.length];

		for (int i = 0; i < web.driver.length; i++) {
			Wait_Element_ByName("email", methodname, i);
			web.driver[i].findElement(By.name("email")).sendKeys("jhih_chen@sina.com");
			web.driver[i].findElement(By.name("password")).sendKeys("12345678abcdefg");
			web.driver[i].findElement(By.className("btn")).click();
			Wait_Element_ByCSS("span[data-reactid='.0.1.0.4']", methodname, i);
			element[i] = web.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.4']")).getText();

		}

		for (int i = 0; i < web.driver.length; i++) {
			QuitDriver(i);
		}

		return result(resultelement, ans, methodname);
	}

	boolean result(boolean resultelement[], String list, String methodname) {
		boolean result = false;
		for (int i = 0; i < web.driver.length; i++) {

			if (element[i].equals(list) == true) {
				resultelement[i] = true;
				result = true;
				break;
			} else {
				resultelement[i] = false;
				result = false;
			}

		}
		for (int i = 0; i < web.driver.length; i++) {
			if (resultelement[i] == false) {
				System.out.println("MethodName：" + this.getClass().getName() + "." + methodname);
				System.out.println("Device Information：" + web.cap[i]);
			}
		}

		return result;
	}

	void Wait_Element_ByName(String element, String methodname, int i) {

		try {
			wait[i].until(ExpectedConditions.presenceOfElementLocated(By.name(element)));
		} catch (Exception ex) {

			System.out.println("MethodName:" + this.getClass().getName() + "." + methodname);
			System.out.println("Not found " + element);
		}

	}

	void Wait_Element_ByCSS(String element, String methodname, int i) {

		try {
			wait[i].until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(element)));
		} catch (Exception ex) {

			System.out.println("MethodName:" + this.getClass().getName() + "." + methodname);
			System.out.println("Not found " + element);
		}

	}

	void QuitDriver(int i) {
		web.driver[i].quit();
	}
}
