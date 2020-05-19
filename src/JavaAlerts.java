import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts //some alert boxes no html elements those are java based, for that type of elements we will use this methods
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\64bitAutomationSW\\chromedriver_win64\\chromedriver.exe"); //to add chromedriver.exe
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");//taken a sample site
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();//clicking on the confirmation alert button
		System.out.println(driver.switchTo().alert().getText());// getText(); is used to get the text from the alert box
		driver.switchTo().alert().accept();// these accept is for 'ok', 'proceed'
//		driver.switchTo().alert().dismiss();// these dismiss is for cancle and dismiss
//		driver.switchTo().alert().sendKeys("qwifdv");//if alert boxes have any text boxes we can send the keys like this
//	 driver.switchTo().alert().accept();
	}

}
