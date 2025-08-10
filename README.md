# Test Automation Framework

This is a Java-based test automation framework.

The framework leverages various libraries and tools to facilitate data-driven testing, logging, reporting, and integration with cloud-based testing platform like lambdatest.



## About Me
Hi, My Name is Purushoth Suresh and I have 4 years of experience in Automation Testing using technologies like Selenium Webdriver, Appium. 

My major expertise is in Java Programming Language.


## Author

- [@purushoth-suresh](https://github.com/purushoth-suresh)

## Prerequisites

Before running this framework, ensure the following software is installed on your system:

- **Java 11** - Make sure Java is installed and the JAVA_HOME environment variable is set.
- **Maven** - Ensure Maven is installed and added to the system path.
- Downlod Link: https://maven.apache.org/download.cgi



## Features
- **Data-Driven Testing**: Using OpenCSV, Apache POI, and Gson for reading test data from CSV and Excel files and JSON.
- **Cross-Browser Testing**: Supports running tests on different browsers.
- **Headless Mode**: Faster execution by running tests in headless mode.
- **Cloud Testing**: Integrated with LambdaTest to run tests on the cloud.
- **Logging**: Uses Log4j for detailed logs.
- **Reporting**: Generates detailed reports using Extent Reports.



## Technologies Used
- Java 11
- TestNG
- OpenCSV
- Gson
- Apache POI
- Faker
- LambdaTest
- Log4j
- Extent Reports

## Setup Instructions

**Clone the Repository:**

```bash
  git clone https://github.com/jatin99/Test-Automation-Framework.git

  cd Test-Automation-Framework
```
    

**Running Tests on LambdaTest:**

```bash
     mvn test  -Dbrowser=chrome -DisLambdaTest=true -DisHeadless=false -X

```


**Running Tests on Chrome browser on Local Machine in Headless Mode:**

```bash
     mvn test  -Dbrowser=chrome -DisLambdaTest=false -DisHeadless=true -X

```

## Reports & Logs
-Reports: After execution, a detailed HTML report will be generated at ./report.html. 

The report contains information on test cases executed, passed, failed, and skipped, along with screenshots for failed tests.

## Logs: 
Logs are created during the test execution and stored in the ./logs/ directory. 

## Integrated the project Github Actions 
This automation framework is integrated with github actions.
The tests will be executed at 11:30PM IST every single day. 

The reports will be archieved in gh-pages branch
