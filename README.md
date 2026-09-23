# Rediffmail Signup Automation

Selenium WebDriver UI automation for the Rediffmail registration flow. The project uses Java, Maven, TestNG, and the Page Object Model to keep browser interactions separate from test orchestration.

## What It Covers

- Opens the Rediffmail login page and navigates to new account registration
- Enters full name, email, password, and password confirmation
- Checks email availability
- Selects date of birth and country
- Reads test data from `tests/data.xlsx`
- Creates and tears down a Chrome browser for each test
- Uses WebDriverManager to manage ChromeDriver

## Project Structure

```text
src/main/java/
  base/BaseTest.java       Browser setup and teardown
  pages/loginpage.java     Login page object
  pages/NewUser.java       Registration page object
  utils/ExcelUtils.java    Excel data reader
src/test/java/
  tests/redifTest.java     Signup test case
tests/data.xlsx            Data-driven test input
testng.xml                 TestNG suite configuration
pom.xml                    Maven dependencies and build plugins
```

## Technology Stack

- Java 11
- Selenium WebDriver 4.19.1
- TestNG 7.9.0
- Apache POI 5.2.5
- WebDriverManager 5.6.3
- Maven

## Running the Test

Prerequisites: Java 11 or later, Maven, Google Chrome, and network access for Maven dependencies and the target website.

```bash
mvn test
```

The test launches Chrome and executes the TestNG suite defined in `testng.xml`.

## Design Insights

- Page objects centralize locators and form actions, making UI changes easier to maintain.
- Excel-driven input allows the same flow to be exercised with different registration data.
- The base test owns browser lifecycle management so test classes remain focused on behavior.

## Notes

- This is a UI automation project, not an account provisioning service.
- The target website can change its markup or validation rules, which may require locator updates.
- Use test-only credentials and data. Do not commit real passwords or personal information to the Excel file.