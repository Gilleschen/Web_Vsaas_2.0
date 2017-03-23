package Vsaas;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Method_Defintion {

	Platform web = new Platform();
	int sec = 10;
	WebDriverWait[] wait = new WebDriverWait[web.driver.length];
	// String element[] = new String[web.driver.length];
	boolean resultelement[] = new boolean[web.driver.length];

	public Method_Defintion() {
		for (int i = 0; i < web.driver.length; i++) {
			wait[i] = new WebDriverWait(web.driver[i], sec);

		}
	}

	public boolean result(String element[], String list, String methodname) {
		boolean result = false;
		for (int i = 0; i < web.driver.length; i++) {

			if (element[i].equals(list) == true) {
				resultelement[i] = true;
				result = true;
				continue;
			} else {
				resultelement[i] = false;
				result = false;
			}

		}
		for (int i = 0; i < web.driver.length; i++) {
			if (resultelement[i] == false) {
				System.out.println("MethodName¡G" + this.getClass().getName() + "." + methodname);
				System.out.println("Device Information¡G" + web.cap[i]);
			}
		}

		return result;
	}

	public boolean mutilresult(String list[], String methodname, String CreateAccountElement[][]) {
		boolean result = false;
		for (int i = 0; i < web.driver.length; i++) {

			for (int j = 0; j < list.length; j++) {
				if (CreateAccountElement[i][j].equals(list[j]) == true) {
					resultelement[i] = true;
					result = true;
					continue;
				} else {
					resultelement[i] = false;
					result = false;
				}
			}

		}
		for (int i = 0; i < web.driver.length; i++) {
			if (resultelement[i] == false) {
				System.out.println("MethodName¡G" + this.getClass().getName() + "." + methodname);
				System.out.println("Device Information¡G" + web.cap[i]);
			}
		}

		return result;
	}

	public void Wait_Element_ByName(String element, String methodname, int i) {

		try {
			wait[i].until(ExpectedConditions.presenceOfElementLocated(By.name(element)));
		} catch (Exception ex) {

			System.out.println("MethodName:" + this.getClass().getName() + "." + methodname);
			System.out.println("Not found " + element);
		}

	}

	public void Wait_Element_ByCSS(String element, String methodname, int i) {

		try {
			wait[i].until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
		} catch (Exception ex) {

			System.out.println("MethodName:" + this.getClass().getName() + "." + methodname);
			System.out.println("Not found " + element);
		}

	}

	public void QuitDriver(int i) {
		web.driver[i].quit();
	}

	public void sleep(int x) {
		try {
			Thread.sleep(x * 1000);
		} catch (InterruptedException e) {
			;
		}
	}

}
