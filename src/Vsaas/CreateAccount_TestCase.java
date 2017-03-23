package Vsaas;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount_TestCase {
	// Platform web = new Platform();
	Method_Defintion method = new Method_Defintion();
	String element[] = new String[Platform.driver.length];
	
	public boolean CreateAccount_PasswordNotMatch(){
		String ans = "�K�X�P�T�{�K�X���@�P";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		//String element[] = new String[Platform.driver.length];
		for (int i = 0; i < Platform.driver.length; i++) {
			EnterCreateAccount_page(i);
			Platform.driver[i].findElement(By.name("password")).sendKeys("888888ii");
			Platform.driver[i].findElement(By.name("cfm-password")).sendKeys("66666iii");
			Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.7.1']")).click();
			method.Wait_Element_ByCSS("span[data-reactid='.0.1.0.2.1.1']", methodname, i);
			element[i] = Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1.1']")).getText();
		}

		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}
		return method.result(element, ans, methodname);
		
		
	}

	public boolean CreateAccount_InvalidePassword() {
		String ans = "�Шϥ�8��20�Ӧr���������r���M�Ʀr�զX�ӫإ߱K�X";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		//String element[] = new String[Platform.driver.length];
		for (int i = 0; i < Platform.driver.length; i++) {
			EnterCreateAccount_page(i);
			Platform.driver[i].findElement(By.name("password")).sendKeys("888");
			Platform.driver[i].findElement(By.name("cfm-password")).sendKeys("888");
			Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.7.1']")).click();
			method.Wait_Element_ByCSS("span[data-reactid='.0.1.0.2.1.1']", methodname, i);
			element[i] = Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1.1']")).getText();
		}

		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}
		return method.result(element, ans, methodname);
	}

	public boolean CreateAccount_InvalideMail() {
		String ans = "�q�l�l��榡���~";
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		//String element[] = new String[Platform.driver.length];
		for (int i = 0; i < Platform.driver.length; i++) {
			EnterCreateAccount_page(i);
			Platform.driver[i].findElement(By.name("email")).sendKeys("ffff.com.tw");
			Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.7.1']")).click();
			method.Wait_Element_ByCSS("span[data-reactid='.0.1.0.1.1']", methodname, i);
			element[i] = Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.1.1']")).getText();

		}
		for (int i = 0; i < Platform.driver.length; i++) {
			method.QuitDriver(i);
		}
		return method.result(element, ans, methodname);
	}

	public boolean CreateAccount_ALLBlank() {

		String ans[] = { "�п�J�z���q�l�l��", "�п�J�z���K�X", "�п�J�z���ʺ�", "�ж�J���ҽX", "�о\Ū�æP�N���U����" };
		String id[] = { ".0.1.0.1.1", ".0.1.0.2.1.1", ".0.1.0.3.1", ".0.1.0.4.0.1", ".0.1.0.6.1" };
		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		String CreateAccountElement[][] = new String[Platform.driver.length][id.length];

		for (int i = 0; i < Platform.driver.length; i++) {
			EnterCreateAccount_page(i);
			method.Wait_Element_ByCSS("input[data-reactid='.0.1.0.6.0.0.0']", methodname, i);
			Platform.driver[i].findElement(By.cssSelector("input[data-reactid='.0.1.0.6.0.0.0']")).click();
			Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.0.7.1']")).click();
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

	void EnterCreateAccount_page(int i) {

		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		method.Wait_Element_ByCSS("span[data-reactid='.0.1.1.1']", methodname, i);
		Platform.driver[i].findElement(By.cssSelector("span[data-reactid='.0.1.1.1']")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
