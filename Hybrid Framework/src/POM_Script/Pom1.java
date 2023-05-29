package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Script.Base_Page;
import net.bytebuddy.implementation.bind.annotation.Super;

public class Pom1 extends Base_Page
{
	@FindBy(name="email")
	private WebElement usname;
	@FindBy(name="pass")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public Pom1(WebDriver driver)
	{
      super(driver);
    }
	public void Username(String data)
	{
		usname.sendKeys(data);
	}
	public void Pwd(String data1)
	{
		pass.sendKeys(data1);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}


}
