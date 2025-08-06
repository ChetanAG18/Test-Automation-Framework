🚀 **Advanced UI Automation Framework – v1.0**

A robust, scalable, and modular **Automation Test Framework** built using **Java 21**, designed for cross-browser, cross-environment test execution both locally and on the cloud. Integrated with **LambdaTest**, **TestNG**, and **ExtentReports**, and engineered using best practices like **Page Object Model (POM)**, **Singleton**, and **POJO-based test data abstraction**.

🧩 **Key Features**
✅**Functional Test Implementation**
➢ Login test implemented as the baseline test case.
➢ Uses Page Object Model for structured and reusable UI components.

**🧪 Testing Framework**
➢ Built on TestNG 7.11.0 for test orchestration.
➢ Supports parallel test execution and test grouping.
➢ Retry mechanism for failed tests using IRetryAnalyzer.

**☁️ Cloud & Multi-Browser Testing**
➢ Integrated with LambdaTest for cloud-based test execution.
➢ Supports Headless, Chrome, Firefox, and other browsers.

**📊 Advanced Reporting & Logging**
➢ ExtentReports for rich HTML reports with visual logs.
➢ Log4j 2.25.1 used for capturing and storing detailed logs per test case.

**📁 Data-Driven Testing**
➢ JSON (via Gson) for structured test data.
➢ CSV (via OpenCSV) for flat file data sources.
➢ Excel (via Apache POI) for spreadsheet-based test data.

**🛠 Utility Components & Design Patterns**
➢ BrowserUtility class wraps WebDriver methods for clean abstraction.
➢ Utility classes for reusable actions and operations.
➢ Implements Singleton Design Pattern for WebDriver lifecycle management.
➢ Uses POJO classes to represent structured test data.
➢ Multiple environments (DEV, QA, UAT) managed via .properties and .json configuration files.

**✅ Code Quality**
➢ Integrated SonarLint to maintain clean, maintainable, and error-free code.

**🧰 Dependencies**

● selenium-java: 4.34.0

● testng: 7.11.0

● gson: 2.13.1

● opencsv: 5.12.0

● poi: 5.4.1

● poi-ooxml: 5.4.1

● log4j-core: 2.25.1

● log4j-api: 2.25.1

● extentreports: 5.1.2
