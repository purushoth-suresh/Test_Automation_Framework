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

### How to Run
```bash
# Clean and build the project
mvn clean install

# Execute tests with TestNG
mvn test

# Execute specific suite
mvn test -DsuiteXmlFile=testng.xml
