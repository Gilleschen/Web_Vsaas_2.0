package Vsaas;

import org.openqa.selenium.By;

public class Logout_TestCase {
	Method_Defintion method = new Method_Defintion();
	String element[] = new String[Platform.driver.length];

	public boolean Logout_Z() {
		String ans = "µn¤J";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();

		for (int i = 0; i < Platform.driver.length; i++) {
			Login(i);
			method.Wait_Element_ByCSS("span[data-reactid='.0.0.0.0.1.$1.0.1']", methodname, i);
			Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.0.0.0.1.$1.0.1']")).click();
			method.Wait_Element_ByCSS("a[data-reactid='.0.1.1.1.$logout.1.0']", methodname, i);
			Platform.driver[i].findElement(By.cssSelector("a[data-reactid='.0.1.1.1.$logout.1.0']")).click();
			method.Wait_Element_ByName("email", methodname, i);
			element[i] = Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.5.1']")).getText();

		}
		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}

		return method.result(element, ans, methodname);

	}

	void Login(int i) {
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		method.Wait_Element_ByName("email", methodname, i);
		Platform.driver[i].findElement(By.name("email")).sendKeys("jhih_chen@sina.com");
		Platform.driver[i].findElement(By.name("password")).sendKeys("888888ii");
		Platform.driver[i].findElement(By.cssSelector("div[data-reactid='.0.1.0.5']")).click();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
