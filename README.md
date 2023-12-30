# Web Order Automation Test Suite

This repository contains an automated test suite for the WebOrder application using Selenium WebDriver and JUnit 5. The test suite covers various functionalities of the WebOrder application, including login, order processing, view all orders, and delete functionality.

## Prerequisites

Before running the tests, make sure you have the following prerequisites installed on your system:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) - Version 17 or higher.
- [Maven](https://maven.apache.org/download.cgi) - A build and dependency management tool.
- Web browsers: The tests support Chrome, Firefox, and Edge. Make sure you have the corresponding web driver installed and accessible from your system's PATH.

## Getting Started

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/alizcelik/com.web-order.git

2. Navigate to the project directory:

   ```bash
   cd com.web-order
   ```
   
3. Run the tests:

   ```bash
    mvn clean test
    ```
   By default, the tests will run using Chrome. To specify a different browser, you can set the browser system property:
    
    ```bash
     mvn clean test -Dbrowser=firefox
     ```
   
4. After the tests are completed, you can find the test reports in the target/surefire-reports directory.

## Test Cases

The test cases are organized into multiple classes, each covering specific functionalities. You can find the test classes in the src/test/java directory.

- WO_001_LP_01.java: Covers the login functionality with valid credentials.
- WO_002_LP_02.java: Covers the login functionality with invalid credentials.
- ...

## Customizing the Tests
If you need to customize the tests or add more test cases, you can create additional test classes following the same structure and extend the Hooks class for WebDriver setup and teardown.


## Dependencies
- Selenium WebDriver: Used for browser automation.

- JUnit 5: Used for writing and running test cases.

## Plugins

- Maven Surefire Plugin: Used for generating test reports.

- Maven Compiler Plugin: Used for compiling the source code.

## Contributors

- [Inar Academy] (https://inar-academy.com/)

