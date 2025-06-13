# OrangeHRM BDD Test Automation

This project is a Behavior-Driven Development (BDD) framework using **Cucumber**, **Selenium WebDriver**, and **JUnit** for automated testing of the [OrangeHRM](https://opensource-demo.orangehrmlive.com/) login functionality.

##  Tech Stack

- Java
- Maven
- Selenium WebDriver
- Cucumber (BDD)
- JUnit

##  Project Structure

BDDTest/
├── pom.xml
├── src/
│ ├── main/
│ └── test/
│ ├── java/
│ │ └── com/aditya/bdd/
│ │ ├── StepDefinitions.java
│ │ └── TestRunner.java
│ └── resources/
│ └── features/
│ └── Login.feature



## 🔧 Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/adityawardhan1/OrangeHRM-BDD-Test.git
   cd OrangeHRM-BDD-Test
Make sure you have:

Java JDK 17+

Maven

ChromeDriver installed and set in PATH.

Run the tests:
mvn test

Test Scenario
Feature: Login functionality
Scenario: Successful login to OrangeHRM

Given the user is on the login page

When the user enters valid credentials

Then the user should be redirected to the dashboard
