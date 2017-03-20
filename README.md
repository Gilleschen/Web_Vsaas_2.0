# Web_Vsaas_2.0使用說明
#### 步驟：

1. 於c槽新增txt文字文件，命名為browser (路徑：c:\browser.txt)
2. 開啟browser.txt
3. 輸入瀏覽器：IE、FireFox、Chrome (僅支援IE、FireFox、Chrome，請注意大小寫，使用逗點區隔)，範例如下圖。

![image](https://github.com/Gilleschen/Web_Vsaas_2.0/blob/master/picture/browser.png)

4. 使用json建立capabilities資訊，如[範例](https://github.com/Gilleschen/Web_Vsaas_2.0/blob/master/json/browser.json)

5. 下載 [Selenium Standalone Server](http://www.seleniumhq.org/download/)

6. 啟動終端機

    6.1 調整Path至Selenium Standalone Server目錄
    
    6.2 啟動 Selenium Standalone Server
    
      方法1. 輸入 java -jar selenium-server-standalone-3.3.1.jar -port 5555 -role node -hub http://localhost:4444/grid/register -nodeConfig browser.json
      
      方法2. 輸入 java -Dwebdriver.ie.driver=C:/Users/jhih_chen/Desktop/test/IEDriverServer.exe -Dwebdriver.gecko.driverC:/Users/jhih_chen/Desktop/test/geckodriver.exe -Dwebdriver.chrome.driver=C:/Users/jhih_chen/Desktop/test/chromedriver.exe -jar selenium-server-standalone-3.3.1.jar -port 5555 -role node -hub http://localhost:4444/grid/register -nodeConfig browser.json

7. 進入http://localhost:4444/grid/console ， Selenium Server及Node成功啟動畫面下圖：
![image](https://github.com/Gilleschen/Web_Vsaas_2.0/blob/master/picture/selenium_server_node.PNG)

備註：使用Jenkins需安裝Selenium Plugin
