cd C:\mywork\seleniumgit\munivisorautomatedtestSelenium\testAutomationAnywhere\seleniumGrid\setup\loadnode4
java -Dwebdriver.chrome.driver=C:\mywork\AUTOMATION\testAutomationAnywhere\seleniumGrid\chromedriver.exe -jar selenium-server-standalone-3.12.0.jar -role webdriver -hub http://localhost:4444/grid/register -port 6664 -browser browserName=chrome