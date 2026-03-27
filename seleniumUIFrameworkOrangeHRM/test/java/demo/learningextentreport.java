package demo;



import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class learningextentreport {
@Test
public void practice() {
	ExtentReports test = new ExtentReports();
	 ExtentSparkReporter spark = new ExtentSparkReporter("./reports/sample_reports.html");
	 test.attachReporter(spark);
	 ExtentTest ref = test.createTest("sample Test");
	 ref.info("--started test execution--");
	 ref.pass("--the test step has passes--");
	 ref.fail("--the test step has failed--");
test.flush();	 
}
}
