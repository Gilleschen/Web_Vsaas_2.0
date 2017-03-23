package Vsaas;

import org.openqa.selenium.By;
import Vsaas.Platform;

public class Login_TestCase {

	Method_Defintion method = new Method_Defintion();
	String element[] = new String[Platform.driver.length];

	public boolean Login_Z() {
		String ans = "所有設備";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		// String element[] = new String[Platform.driver.length];
		for (int i = 0; i < Platform.driver.length; i++) {
			method.Wait_Element_ByName("email", methodname, i);
			Platform.driver[i].findElement(By.name("email")).sendKeys("jhih_chen@sina.com");
			Platform.driver[i].findElement(By.name("password")).sendKeys("888888ii");
			Platform.driver[i].findElement(By.className("btn")).click();
			method.Wait_Element_ByCSS("span[data-reactid='.0.1.0.0.1']", methodname, i);
			element[i] = Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.0.1']")).getText();
		}
		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}

		return method.result(element, ans, methodname);

	}

	public boolean Login_ALLBlank_Email() {
		String ans = "請輸入您的電子郵件";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		// String element[] = new String[Platform.driver.length];
		for (int i = 0; i < Platform.driver.length; i++) {
			method.Wait_Element_ByName("email", methodname, i);
			Platform.driver[i].findElement(By.className("btn")).click();
			method.Wait_Element_ByCSS("span[data-reactid='.0.1.0.1.1']", methodname, i);
			element[i] = Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.1.1']")).getText();

		}
		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}
		return method.result(element, ans, methodname);

	}

	public boolean Login_AllBlank_Password() {

		String ans = "請輸入您的密碼";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		// String element[] = new String[Platform.driver.length];
		for (int i = 0; i < Platform.driver.length; i++) {
			method.Wait_Element_ByName("email", methodname, i);
			Platform.driver[i].findElement(By.className("btn")).click();
			method.Wait_Element_ByCSS("span[data-reactid='.0.1.0.2.1']", methodname, i);
			element[i] = Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).getText();

		}
		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}
		return method.result(element, ans, methodname);

	}

	public boolean Login_InvalideMail() {
		String ans = "電子郵件格式錯誤";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		// String element[] = new String[Platform.driver.length];
		for (int i = 0; i < Platform.driver.length; i++) {
			method.Wait_Element_ByName("email", methodname, i);
			Platform.driver[i].findElement(By.name("email")).sendKeys("jhih_chensina.com");
			Platform.driver[i].findElement(By.name("password")).sendKeys("888888ii");
			Platform.driver[i].findElement(By.className("btn")).click();
			method.Wait_Element_ByCSS("span[data-reactid='.0.1.0.1.1']", methodname, i);
			element[i] = Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.1.1']")).getText();

		}
		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}
		return method.result(element, ans, methodname);
	}

	public boolean Login_WrongPassword_rule() {
		String ans = "請使用8到20個字元之間的字母和數字組合來建立密碼";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		// String element[] = new String[Platform.driver.length];
		for (int i = 0; i < Platform.driver.length; i++) {
			method.Wait_Element_ByName("email", methodname, i);
			Platform.driver[i].findElement(By.name("email")).sendKeys("jhih_chen@sina.com");
			Platform.driver[i].findElement(By.name("password")).sendKeys("8888888888");
			Platform.driver[i].findElement(By.className("btn")).click();
			method.Wait_Element_ByCSS("span[data-reactid='.0.1.0.2.1']", methodname, i);
			element[i] = Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).getText();

		}
		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}
		return method.result(element, ans, methodname);
	}

	public boolean Login_WrongPassword() {
		String ans = "帳號或密碼錯誤";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		// String element[] = new String[Platform.driver.length];

		for (int i = 0; i < Platform.driver.length; i++) {
			method.Wait_Element_ByName("email", methodname, i);
			Platform.driver[i].findElement(By.name("email")).sendKeys("jhih_chen@sina.com");
			Platform.driver[i].findElement(By.name("password")).sendKeys("12345678abcdefg");
			Platform.driver[i].findElement(By.className("btn")).click();
			method.Wait_Element_ByCSS("span[data-reactid='.0.1.0.4']", methodname, i);
			element[i] = Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.4']")).getText();
		}

		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}

		return method.result(element, ans, methodname);
	}

}
