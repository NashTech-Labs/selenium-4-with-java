
# Handling Multiple Windows or Tabs using Selenium

This template helps you to to handling of multiple Windows or tabs using selenium 4.0.



## What is a window handle?
It is a unique identifier that holds the address of all the windows. Think of it as a pointer to a window, which returns the string value. It is assumed that each browser will have a unique window handle. This window handle function helps to retrieve the handles of all windows.

## Technologies Used

**Programming language:** Java

**Build tool:** Maven

**Automation tool:** Selenium Webdriver

**IDE:** Intellij Idea
## Dependencies Used-

Selenium Webdriver

```bash
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>4.1.0</version>
        </dependency>
```
Apache poi

```bash
 
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>5.0.0</version>
        </dependency>
```
Selenium java

```bash
 
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.0.0-alpha-7</version>
        </dependency>
```
Apache poi-ooxml

```bash
         <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>5.0.0</version>
            <scope>test</scope>
        </dependency>
```

## Steps for Execution

1. Clone or Download the repository in your System

2. Open the project in any IDE which run maven project.

3. Download the latest version of Chrome Driver and Gecko Driver from the link given below and place that in the chromedriver_linux64 and geckodriver-v0.30.0-linux64 folder respectively.

4. Go to project and run Test files using ```mvn test``` command.

Link for download chrome driver: 
https://chromedriver.chromium.org/downloads

Link for download gecko driver:
https://github.com/mozilla/geckodriver/releases

## 🔗 For a better understanding please refer to this blog Link

https://blog.knoldus.com/how-to-handle-multiple-windows-or-tabs-using-selenium-4-0/
