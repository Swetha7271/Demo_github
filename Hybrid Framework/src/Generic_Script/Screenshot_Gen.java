package Generic_Script;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Gen
{
	public static WebDriver driver;

	public static  void Screenshot() throws IOException 
	{
		String photo="./Photos/";
		Date d = new Date();
		String d1=d.toString();
		String d2 = d1.replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Src=ts.getScreenshotAs(OutputType.FILE);
		File Dst=new File(photo+d2+".jpeg");
		FileHandler.copy(Src, Dst)	;
	
	}

}
