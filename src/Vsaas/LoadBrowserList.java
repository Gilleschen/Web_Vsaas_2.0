package Vsaas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadBrowserList {
	public static ArrayList<String> BrowserList = new ArrayList<String>();
	public static ArrayList<String> TempList = new ArrayList<String>();

	public LoadBrowserList() {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\browser.txt");

		} catch (FileNotFoundException e) {
			System.out.println("找不到C:\\browser.txt");
			;
		}

		BufferedReader br = new BufferedReader(fr);
		String line;
		String[] DeviceList;

		try {
			while ((line = br.readLine()) != null) {
				TempList = new ArrayList<String>();
				BrowserList = new ArrayList<String>();

				DeviceList = line.split(",");

				for (int i = 0; i < DeviceList.length; i++) {

					TempList.add(DeviceList[i]);
				}
				for (int i = 0; i < TempList.size(); i++) {
					if (TempList.get(i).equals("IE") || TempList.get(i).equals("FireFox")
							|| TempList.get(i).equals("Chrome")) {
						BrowserList.add(TempList.get(i));
					} else {
						System.out.println("不支援" + TempList.get(i));
					}
				}

				System.out.println("測試瀏覽器：" + BrowserList);

			}
		} catch (IOException e) {
			;
		}
	}

	public static void main(String[] args) {

	}

}
