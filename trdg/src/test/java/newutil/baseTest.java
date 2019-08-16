package newutil;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class baseTest {
	
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
 
  @AfterMethod
  public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "FAILED", ExtentColor.RED));
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + result.getName() + ".jpeg";
			FileUtils.copyFile(src, new File(path));
			logger.addScreenCaptureFromPath(path, result.getName());
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + "Failed", ExtentColor.RED));
			logger.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "PASSED", ExtentColor.GREEN));
		} else {
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "SKIPPED", ExtentColor.ORANGE));
			logger.skip(result.getThrowable());
		}
	}


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "vlohe@gmail.com", "1234567" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver= utility.getDriver("chrome");
	  driver.get("http://demowebshop.tricentis.com/login");
	  driver.manage().window().maximize();
	  htmlReporter = new ExtentHtmlReporter(System.getProperty("User.dir") + "/test-output/testReport.html");
	  extent = new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  htmlReporter.config().setDocumentTitle("Extent Report Demo");
	  htmlReporter.config().setReportName("Test Report");
	  htmlReporter.config().setTheme(Theme.STANDARD);
      htmlReporter.config().setTimeStampFormat("EEE, MMMM dd, yyyy, hh:mm a'('zzz')'");
  }

  @AfterTest
  public void afterTest() {
	  extent.flush();
	  driver.close();
  }

}
