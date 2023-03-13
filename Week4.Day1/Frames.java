package learnframes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.manage().window().maximize();
		d.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		d.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert a=d.switchTo().alert();
		a.sendKeys("Ranji");
		a.accept();
		String s=d.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(s);
		
		

	}

}
