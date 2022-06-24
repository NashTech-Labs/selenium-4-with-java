
# Data Driven Framework in selenium using Excel

This template helps you with Login a website using the data driven testing framework in selenium with the both positive and negative test cases.



## What is Data Driven framework?
DDT framework is an automation testing framework that allows you to use a single test script to validate a test case against different types of test data. The test data corresponding to positive as well as negative testing is stored in a file, and the test script uses all these values as inputs to execute the tests.

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
TestNG

```bash
          <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.5</version>
          </dependency>
```

## Steps for Execution

1. Clone or Download the repository in your System

2. Open the project in any IDE which run maven project.

3. Download the latest version of Chrome Driver from the link given below and place that in the chromedriver_linux64 folder.

4. Go to project and run Test files using ```mvn test``` command.

Link for download chrome driver: 
https://chromedriver.chromium.org/downloads
