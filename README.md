# Automation Testing Framework – Java | Selenium | TestNG

This repository contains a **Test Automation Framework** designed for **web application testing** using **Java**, **Selenium WebDriver**, and **TestNG**, built on **TDD principles** and following the **Page Object Model (POM)** design pattern for maintainability and scalability.

---

## 🚀 Key Features
- **Test-Driven Development (TDD):** Ensures tests are designed before implementation for high-quality, reliable automation.
- **Page Object Model (POM):** Provides clean separation of test logic and UI elements, improving reusability and reducing maintenance effort.
- **Parallel Execution:** Integrated with TestNG to run multiple tests simultaneously, reducing overall execution time.
- **Headless Execution:** Supports headless mode for faster test execution in CI/CD pipelines.
- **Cross-Browser & Cloud Testing:** Seamless execution on **LambdaTest Cloud** for different browsers, versions, and operating systems.
- **Data-Driven Testing:** Handles test data from **JSON**, **CSV**, and **Excel** for comprehensive test coverage.
- **Tag-Based Execution:** Enables selective execution of tests based on defined groups or tags.
- **Advanced Reporting & Logging:** Integrated with **Log4j** for logging and **ExtentReports** for detailed HTML reports with screenshots.
- **Maven Integration:** For dependency management and build automation.

---

## 📂 Project Structure
src
├── com.ui # Page classes representing application screens
├── com.test # Test classes for scenarios and validations
├── com.utility # Common reusable utilities and helpers
├── com.listeners # Custom TestNG listeners for logging and reporting
└── com.pojo # POJO classes for structured data representation
---

## 🛠️ Technology Stack
- **Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **Testing Framework:** TestNG  
- **Build Tool:** Maven  
- **Cloud Execution:** LambdaTest  
- **Data Sources:** JSON, CSV, Excel  
- **Logging & Reporting:** Log4j, ExtentReports  

---

## ✅ About the Framework
This framework is designed for **scalable, maintainable, and high-performance test automation**, suitable for both **local and cloud-based executions**. It implements **OOP principles**, enabling better modularity and reusability, and supports **continuous integration pipelines** by offering **headless execution** and **parallel testing**.

---

### 📌 How to Run
```bash
# Clean and build the project
mvn clean install

# Execute tests with TestNG
mvn test

# Execute specific suite
mvn test -DsuiteXmlFile=testng.xml
