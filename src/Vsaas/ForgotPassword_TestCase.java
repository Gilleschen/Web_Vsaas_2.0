package Vsaas;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPassword_TestCase {
	Method_Defintion method = new Method_Defintion();

	public boolean ForgotPassword_InvalideEmail() {

		String ans = "電子郵件格式錯誤";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		String element[] = new String[Platform.driver.length];

		for (int i = 0; i < Platform.driver.length; i++) {
			EnterForgotPassword_page(i);
			method.Wait_Element_ByName("email", methodname, i);
			Platform.driver[i].findElement(By.name("email")).sendKeys("com.sin.tw");
			Platform.driver[i].findElement(By.cssSelector("div[data-reactid='.0.1.0.5']")).click();
			element[i] = Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).getText();

		}
		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}

		return method.result(element, ans, methodname);

	}

	public boolean ForgotPassword_AllBlank() {
		String ans[] = { "請輸入您的電子郵件", "請填入驗證碼" };
		String id[] = { ".0.1.0.2.1", ".0.1.0.3.0.1" };
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		String CreateAccountElement[][] = new String[Platform.driver.length][id.length];

		for (int i = 0; i < Platform.driver.length; i++) {
			EnterForgotPassword_page(i);
			method.Wait_Element_ByCSS("div[data-reactid='.0.1.0.5']", methodname, i);
			Platform.driver[i].findElement(By.cssSelector("div[data-reactid='.0.1.0.5']")).click();

			for (int j = 0; j < id.length; j++) {
				CreateAccountElement[i][j] = Platform.driver[i]
						.findElement(By.cssSelector("span[data-reactid='" + id[j] + "']")).getText();
			}
		}
		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}

		return method.mutilresult(ans, methodname, CreateAccountElement);

	}

	void EnterForgotPassword_page(int i) {
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		method.Wait_Element_ByCSS("span[data-reactid='.0.1.2.0']", methodname, i);
		Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.2.0']")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
