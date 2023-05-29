package Test_Script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import POM_Script.Pom1;

public class RunnerScript1 extends Base_Test
{

@Test
public void valid_Login(String d1,String d2) throws InterruptedException
{
	Pom1 p=new Pom1(driver);
	p.Username(d1);
	p.Pwd(d2);
	Thread.sleep(2000);
    p.clickLogin();
} 
    @DataProvider(name = "create")
    public static Object[][] createData() {
      return new Object[][] 
      {
    	  {"Santhosh","1234" },
    	  //{"Pradeep","5674"}
      };

}
}


