package com.selenium.UIFrameworkOrangeHRM;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vacancyPage {

	 WebDriver driver;
	    WebDriverWait wait;

	    // Constructor
	    public vacancyPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    // ================= WebElements =================

	    // Recruitment Tab
	    @FindBy(xpath = "//span[text()='Recruitment']")
	    private WebElement recruitmentTab;

	    // Vacancies Tab
	    @FindBy(linkText = "Vacancies")
	    private WebElement vacanciesTab;

	    // Add Button
	    @FindBy(xpath = "//button[normalize-space()='Add']")
	    private WebElement addButton;

	    // Vacancy Name 
	    @FindBy(xpath = "//label[text()='Vacancy Name']/following::input[1]")
	    private WebElement vacancyName;

	    // Job Title Dropdown
	    @FindBy(xpath = "//label[text()='Job Title']/following::div[1]")
	    private WebElement jobTitleDropdown;

	    // Description
	    @FindBy(xpath = "//textarea")
	    private WebElement description;

	    // Hiring Manager
	    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
	    private WebElement hiringManager;

	    // Number of Positions
	    @FindBy(xpath = "//label[text()='Number of Positions']/following::input[1]")
	    private WebElement numberOfPositions;

	    // Save Button
	    @FindBy(xpath = "//button[@type='submit']")
	    private WebElement saveButton;

	    // ================= Actions =================

	    public void navigateToVacancies() {
	        recruitmentTab.click();
	        vacanciesTab.click();
	    }

	    public void clickAddButton() {
	        addButton.click();


	       // wait.until(ExpectedConditions.visibilityOf(vacancyName));
	    }

	    public void enterVacancyName(String name) {
	       // wait.until(ExpectedConditions.visibilityOf(vacancyName));
	        vacancyName.sendKeys(name);
	    }

	    public void selectJobTitle() throws InterruptedException {
	        jobTitleDropdown.click();
	        Thread.sleep(2000); // can replace with wait
	        jobTitleDropdown.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	    }

	    public void enterDescription(String desc) {
	        description.sendKeys(desc);
	    }

	    public void selectHiringManager(String name) throws InterruptedException {
	        hiringManager.sendKeys(name);
	        Thread.sleep(2000);
	        hiringManager.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	    }

	    public void enterNumberOfPositions(String num) {
	        numberOfPositions.sendKeys(num);
	    }

	    public void clickSaveButton() {
	        saveButton.click();
	    }
	}