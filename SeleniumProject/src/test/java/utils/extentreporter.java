package utils;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class extentreporter {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("User.dir") + "/test-output/testReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEE, MMMM dd, yyyy, hh:mm a'('zzz')'");

	}

	@Test
	public void passTest() {
		logger = extent.createTest("Pass Test");
		Assert.assertTrue(true);

	}

	@Test
	public void testCase1() {
		logger = extent.createTest("Test Case 1", "PASSED test case");
		Assert.assertTrue(true);

	}

	@Test
	public void testCase2() {
		logger = extent.createTest("Test Case 2", "PASSED test case");
		Assert.assertTrue(true);

	}

	@Test
	public void testCase3() {
		logger = extent.createTest("Test Case 3", "PASSED test case");
		Assert.assertTrue(true);

	}

	@Test
	public void testCase4() {
		logger = extent.createTest("Test Case 4", "PASSED test case");
		Assert.assertTrue(false);

	}

	@Test
	public void testCase5() {
		logger = extent.createTest("Test Case 5", "SKIPPED test case");
		throw new SkipException("Skipping this test with exception");
	}

	@Test(enabled = false)
	public void testCase6() {
		logger = extent.createTest("Test Case 6", "I'm Not Ready, please dont't execute me");
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "FAILED", ExtentColor.RED));
			logger.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "PASSED", ExtentColor.GREEN));
		} else {
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "SKIPPED", ExtentColor.ORANGE));
			logger.skip(result.getThrowable());
		}
	}

	@AfterTest
	public void aftertest() {
		extent.flush();
	}

}
