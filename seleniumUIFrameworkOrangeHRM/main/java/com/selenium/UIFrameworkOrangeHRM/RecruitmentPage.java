package com.selenium.UIFrameworkOrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

    WebDriver driver;

    // Constructor
    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ================= WebElements =================

    // Recruitment Tab (optional if coming from dashboard)
    @FindBy(xpath = "//span[.='Recruitment']")
    private WebElement recruitmentTab;

    // Vacancies Link
    @FindBy(xpath="(//a[contains(@class,\"oxd-topbar-body-nav-tab-item\")])[2]")
    private WebElement vacanciesLink;

    // ================= Actions =================

    public void clickRecruitmentTab() {
        recruitmentTab.click();
    }

    public void clickVacanciesLink() {
        vacanciesLink.click();
    }
}