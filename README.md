# QA Brains Web Automation using Selenium, Java and TestNG

A Selenium WebDriver automation project built in Eclipse as a Maven project. It automates common user actions on the QA Brains practice website at https://practice.qabrains.com/ using Java and TestNG, and runs on the Firefox browser.

## About the Project

This project covers the main Selenium skills a beginner QA automation engineer needs. Each test class opens a page of the practice website, finds elements with XPath, and performs real user actions such as typing, clicking, selecting, scrolling and dragging.

## Tech Stack

* Language: Java
* Automation tool: Selenium WebDriver
* Test framework: TestNG
* Build tool: Maven
* IDE: Eclipse
* Browser: Mozilla Firefox
* Locator strategy: XPath

## What Is Covered

* Browser launch and window maximize
* Page navigation using navigate to
* XPath locators using id, text, placeholder, class and absolute paths
* Typing into fields using sendKeys
* Clicking buttons, links, labels and icons
* Dropdown selection using the Select class by index
* Checkbox and radio button selection
* Page scrolling using JavascriptExecutor and scrollIntoView
* Reading text using getText
* Drag and drop using the Actions class
* Waiting using Thread sleep
* Running tests using the TestNG annotation Test

## Test Cases

### 1. E_commerce_site
Tests the e-commerce practice page end to end.
* Opens the e-commerce page and clicks View Test Case
* Closes the popup and goes to the login page
* Logs in with the test credentials provided by the site
* Scrolls smoothly to the QA Topics section
* Clicks through the product buttons and opens the product named Sample Shirt Name
* Works with the cart and the user menu
* Clicks through the confirmation buttons

### 2. forgetpass
Tests the forgot password page.
* Enters an email address
* Writes a comment in the comment box
* Clicks the submit buttons

### 3. Form_Submission
Tests the form submission page.
* Fills name, email, contact number, date and comment
* Scrolls down to the submit button
* Selects a color option, two food options and a country from the dropdown
* Submits the form

### 4. Registration
Tests the registration page.
* Enters the name
* Selects a country and an account type from dropdowns
* Fills email, password and confirm password
* Writes a comment
* Scrolls to the submit button and submits the form

### 5. SendKey
Tests typing on the home page.
* Types a comment in the feedback box
* Scrolls to the QA Topics section
* Types email and password
* Clicks the submit buttons

### 6. Get_text_element
Tests reading text from a page.
* Opens the home page
* Reads the heading Leave Feedback using getText
* Prints the text in the console

### 7. drag_drop
Tests drag and drop.
* Opens the drag and drop page
* Finds the Drag Me box and the Drop Here box
* Moves one onto the other using the Actions class with click and hold, move to element and release

## Project Structure

```
QABrainsAutomation
    src
        Test
            E_commerce_site.java
            forgetpass.java
            Form_Submission.java
            Registration.java
            SendKey.java
            Get_text_element.java
            drag_drop.java
    pom.xml
```

## Prerequisites

* Java JDK 8 or higher
* Eclipse IDE
* Maven
* Mozilla Firefox
* TestNG plugin for Eclipse

## How to Run

1. Clone the repository
```
git clone https://github.com/your-username/your-repository-name.git
```
2. Open Eclipse and choose File, Import, Existing Maven Projects
3. Select the cloned folder and finish the import
4. Right click the project, choose Maven, then Update Project to download the dependencies
5. Open any test class, right click it and choose Run As, then TestNG Test
6. To run every test together, right click the project and choose Run As, then TestNG Test, or run it from a testng.xml file

## Maven Dependencies

Add these to your pom.xml if they are not there already.

```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.x.x</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.x.x</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

Replace the version numbers with the latest stable versions. Selenium 4 manages the Firefox driver automatically, so no manual geckodriver setup is needed.

## Sample Code

```java
@Test
public void Get_text_element() {
    FirefoxDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://practice.qabrains.com/");

    String txt = driver.findElement(
        By.xpath("//h2[normalize-space()='Leave Feedback']")).getText();
    System.out.print("GOT TXT: " + txt);
}
```

## Known Limitations and Future Improvements

* Add assertions so each test passes or fails on real checks
* Replace Thread sleep with explicit waits using WebDriverWait
* Use relative XPath or CSS selectors instead of long absolute XPath
* Move the driver setup into BeforeMethod and driver quit into AfterMethod
* Adopt the Page Object Model to cut repeated code
* Add a testng.xml file to run all tests as one suite
* Add reports such as Extent Reports or the TestNG HTML report
* Add screenshots on failure
* Add cross browser testing for Chrome and Edge

## Author

**Bodda Sami**
Computer Science and Engineering student, East West University

## Acknowledgement

Thanks to QA Brains for the free practice website at https://practice.qabrains.com/.