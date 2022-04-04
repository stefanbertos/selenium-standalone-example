# selenium-standalone-example
1. download selenium https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.1.0/selenium-server-4.1.3.jar
2. download driver https://chromedriver.storage.googleapis.com/100.0.4896.60/chromedriver_win32.zip
3. put it into bin folder
4. start it java -jar selenium-server-4.1.3.jar standalone
5. Then navigate to http://localhost:4444/status
6. run tests gradlew test --tests "CucumberRunner"



to search in google chrome -> console ->$x("//h1[@id='tour-of-heroes-app-and-tutorial']") or see https://devhints.io/xpath
