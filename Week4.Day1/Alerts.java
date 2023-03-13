package learnframes;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.manage().window().maximize();
		d.get("https://www.leafground.com/alert.xhtml");
		d.findElement(By.xpath("//span[text()='Show']")).click();
		Alert a=d.switchTo().alert();
		a.accept();
		String s= d.findElement(By.id("simple_result")).getText();
		System.out.println(s);
		
		d.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert a1=d.switchTo().alert();
		a1.accept();
		
		d.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert a2=d.switchTo().alert();
		a2.sendKeys("yes");
		a2.dismiss();
		
		d.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		d.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		d.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		d.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		d.findElement(By.xpath("//span[text()='Delete']")).click();
		d.findElement(By.xpath("//span[text()='Yes']")).click();
		
		
		
	}

}
