
# Capturing Screenshots using selenium

Screenshots are beneficial, specifically in headless test execution, where you cannot see the GUI of the application. Still, Selenium will capture it by a screenshot and store it in a file so that you can verify the application later.
This template helps you to Capture a Screenshot of a Web Page, Section, and Web Element through Selenium.



## Scenarios in which selenium screenshots would be required-
- When application issues occur
- When an assertion failure occurs.
- When there is some difficulty in finding a web element on a page.
- Where there is a Timeout in finding a web element on a web page


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

3. Download the latest version of Chrome Driver from the link given below and place that in the chromedriver_linux64 folder.

4. Go to project and run Test files.

Link for download chrome driver: 
https://chromedriver.chromium.org/downloads

## 🔗 For a better understanding please refer to this blog Link

https://blog.knoldus.com/how-to-capture-a-screenshot-of-a-web-page-section-and-a-web-element-in-selenium/
