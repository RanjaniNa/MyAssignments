package sampleSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LocatorsSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro Technologies");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nisha");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karthik");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("986543210");
driver.findElement(By.name("submitButton")).click();

}
}
	