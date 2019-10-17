package trying_selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {
	
	public static void main(String args[]) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver lolraja = new ChromeDriver();
		lolraja.manage().window().maximize();
		lolraja.manage().deleteAllCookies();
		lolraja.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		lolraja.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		lolraja.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		lolraja.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("LakmarapuNikitha");
		lolraja.findElement(By.xpath("//div[@id='identifierNext']")).click();
		lolraja.get("https://accounts.google.com/signin/v2/sl/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward");
		lolraja.findElement(By.xpath("//div[@id='password']")).sendKeys("R@m@r@m@123");
		lolraja.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
		
		
		
		
	}

}
