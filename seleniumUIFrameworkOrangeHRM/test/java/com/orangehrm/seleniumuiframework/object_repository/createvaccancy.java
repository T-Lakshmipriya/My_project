package com.orangehrm.seleniumuiframework.object_repository;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.seleniumframework.genericutility.ActionHelper;
import com.orangehrm.seleniumframework.genericutility.BaseClasss;
import com.orangehrm.seleniumframework.genericutility.ExcelUtility;
import com.selenium.UIFrameworkOrangeHRM.AddVacancyPage;
import com.selenium.UIFrameworkOrangeHRM.DashboardPage;
import com.selenium.UIFrameworkOrangeHRM.RecruitmentPage;
import com.selenium.UIFrameworkOrangeHRM.vacancyPage;

public class createvaccancy extends BaseClasss {

    @Test
    public void addVacancy() throws Exception {



        // Utilities

        ExcelUtility eUtil = new ExcelUtility();

        ActionHelper aHelper = new ActionHelper(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



        // Page Objects

        DashboardPage dbp = new DashboardPage(driver);

        RecruitmentPage rp = new RecruitmentPage(driver);

        vacancyPage vp = new vacancyPage(driver);

        AddVacancyPage addvp = new AddVacancyPage(driver);



        // Navigate to Recruitment → Vacancies

        dbp.clickRecruitment();

        rp.clickVacanciesLink();



        // Click Add button

        vp.clickAddButton();



        // Load Excel Data

        String path = "C:\\Users\\senth\\OneDrive\\vaccan.xlsx";

        eUtil.loadExcelFile(path, "Sheet1");



        String vacancyName = eUtil.getDataFromSingleCell(1, 1);

        String description = eUtil.getDataFromSingleCell(1, 2);

        String hiringManager = eUtil.getDataFromSingleCell(1, 3);

        String positions = eUtil.getDataFromSingleCell(1, 4);



        // Fill Vacancy Form

        addvp.enterVacancyName(vacancyName);



        aHelper.navigateDownDropdown(addvp.getJobTitle(), 1);



        addvp.enterDescription(description);



        aHelper.scrollDownAutoSuggestion(

                addvp.getHiringManagerTextField(),

                hiringManager,

                5,

                1

        );



        addvp.enterNumberOfPositions(positions);



        addvp.clickSaveButton();



        // Wait until vacancy list is visible

        wait.until(ExpectedConditions.visibilityOfElementLocated(

                By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']")

        ));



        // Validation

        List<WebElement> rows = driver.findElements(

                By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']")

        );



        boolean isFound = false;



        for (WebElement row : rows) {

            String rowText = row.getText();



            if (rowText.contains(vacancyName)) {

                isFound = true;

                Reporter.log(" Vacancy created successfully: " + vacancyName, true);

                break;

            }

        }



        // Final Assertion

        Assert.assertTrue(isFound, " Vacancy NOT found in list!");

    }

}


