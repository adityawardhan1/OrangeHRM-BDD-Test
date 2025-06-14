package com.aditya.bdd;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddEmployeeSteps {
    WebDriver driver;
    WebDriverWait wait;

    @Given("User is on the OrangeHRM login page")
    public void user_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @When("User logs in with valid credentials")
    public void user_logs_in() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @When("User navigates to the PIM section")
    public void navigate_to_pim() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='PIM']"))).click();
    }

    @When("User clicks on Add Employee")
    public void click_add_employee() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Add Employee']"))).click();
    }

    @When("User enters employee details")
    public void enter_employee_details() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))).sendKeys("John");
        driver.findElement(By.name("lastName")).sendKeys("Doe");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("A new employee should be added successfully")
    public void verify_employee_added() {
        boolean profileVisible = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h6"), "Personal Details"));
        assert profileVisible;
        driver.quit();
    }
}
