## Overview

Selenium has become the industry standard for implementing custom automated tests because of which it is considered the first go-to solution for every web application. Action Class in Selenium is a built-in feature provided by the selenium for handling keyboard and mouse events. This is something very interesting part of Selenium which is performed using the advanced user interaction API in the Selenium Web driver.

## Actions In Selenium

1) Actions class is a built-in ability to handle various types of keyboard and mouse events. It is specifically designed to handle mouseover and keyboard interactions with the user. Apart from that, we use this class to simulate the user’s gestures on the application. However, this class provides specific methods to handle actions in an application which you generally do by mouse or keyboard.

2) We know Selenium methods to click but we haven’t seen moving our mouse towards a specific element. These kinds of mouse interactions, for example, Context-click which means right-click, double click, drag, and drop, etc. are some methods of action class.

3) The Actions class is the user-facing API for emulating complex action events. You can directly use this class rather than using the input devices, i.e. keyboard and mouse.

### Mouse Actions In Selenium

1) click(): Clicks on the element.
2) double Click (): Double clicks on the element.
3) context Click() : Performs a context-click (right-click) on the element.
4) click and hold(): Clicks at the present mouse location without releasing.
5) moveToElement(toElement): It shifts the mouse to the center of the element.

### Technologies used:
**Programming Language** - Java

**Build Tool** - Maven

**Automation Tool** - Selenium

**IDE** - Intellij

### Dependencies Used

**testng**

**SeleniumHq**

### Short Description about this template
This template will make you to understand the concept of *Action class* in Selenium.

### Steps to run the Template in Selenium project
1. Clone the repository on your local system.
2. Let Intellij resolve all the required dependencies.
3. Add the latest chromedriver from https://chromedriver.chromium.org/downloads
4. Run the `src>test>java` files.