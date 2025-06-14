🧪 OrangeHRM BDD Test Automation
This project is a Behavior-Driven Development (BDD) test framework built using Java, Selenium WebDriver, Cucumber, and JUnit. It automates testing workflows on the OrangeHRM Demo Site, such as login and employee management.

🚀 Tech Stack
Java 17+

Maven

Cucumber (BDD)

Selenium WebDriver

JUnit

ChromeDriver

📁 Project Structure
bash
Copy
Edit
BDDTest/
├── pom.xml
└── src/
    ├── main/
    └── test/
        ├── java/
        │   └── com/aditya/bdd/
        │       ├── StepDefinitions.java
        │       ├── TestRunner.java
        │       
        └── resources/
            └── features/
                └── Login.feature
⚙️ Setup Instructions
Clone the repository:

bash
Copy
Edit
git clone https://github.com/adityawardhan1/OrangeHRM-BDD-Test.git
cd OrangeHRM-BDD-Test
Ensure you have the following installed:

Java JDK 17+

Apache Maven

Google Chrome (latest version)

ChromeDriver (match your Chrome version) and added to your system PATH

Run the tests:

bash
Copy
Edit
mvn test
✅ Test Scenarios
📄 Login.feature
gherkin
Copy
Edit
Feature: Login functionality

  Scenario: Successful login to OrangeHRM
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard
Additional scenarios such as Add Employee or Logout can be added to the same feature or as separate .feature files.

📌 Notes
You can view HTML test reports under:

bash
Copy
Edit
target/cucumber-reports.html
Use XPath and CSS Selectors smartly to handle dynamic elements.
