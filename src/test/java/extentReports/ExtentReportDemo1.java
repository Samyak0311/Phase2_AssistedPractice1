package extentReports;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportDemo1 {
	
	@Test
	public void ExtentreporDemo1()
	{
// Initiate extent report engine
// The ExtentReports report client for starting reporters and building reports.For most applications,
//you should have one ExtentReports instance for theentire JVM.
//ExtentReports itself does not build any reports,
//but allows reporters toaccess information, which in turn create the reports.
		
		ExtentReports ex = new ExtentReports();
		
		// initiate extent report reporter --> SparkReporter
		// create a folder in which the extent report will be placed
		// C:\Users\sonal\Eclipse-2023\Phase2-TestNGScriptsReports\\extentreports\\report.html
		
	ExtentSparkReporter sparkreporter = new ExtentSparkReporter("C:\\Users\\sonal\\Eclipse-2023\\Phase2-TestNGScriptsReports\\\\extentreports\\\\report.html");
	
	// connect the ententreport object to extent reporter object
	
	ex.attachReporter(sparkreporter); // report gets created
	
	ex.flush(); // generate the report in the required folder of the project
	
		
	}	
	
}
